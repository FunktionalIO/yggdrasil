// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import scala.util.Failure
import scala.util.Success
import scala.util.Try

/**
 * Represents the absence of a value.
 */
case object Absent

/**
 * Type alias for a value that can either be present or absent.
 * 
 * This type is similar to `Option` but with is closer to a zero-cost abstraction.
 * 
 * @tparam A The type of the value.
 */
type Maybe[A] = A | Absent.type

object Maybe:
    /**
     * Creates a `Maybe` instance with a present value.
     * 
     * @param value The value to be wrapped.
     * @tparam A The type of the value.
     * @return The `Maybe` instance containing the value.
     */
    def just[A](value: A): Maybe[A] = value

    /**
     * Creates a `Maybe` instance representing an absent value.
     * 
     * @tparam A The type of the value.
     * @return The `Maybe` instance representing absence.
     */
    def absent[A]: Maybe[A] = Absent
end Maybe

extension [A](inline maybe: Maybe[A])

    /**
     * Checks if the value is present.
     * 
     * @return `true` if the value is present, `false` otherwise.
     */
    inline def isPresent: Boolean = maybe match
        case Absent => false
        case _      => true

    /**
     * Checks if the value is absent.
     * 
     * @return `true` if the value is absent, `false` otherwise.
     */
    inline def isAbsent: Boolean = maybe match
        case Absent => true
        case _      => false

    /**
     * Gets the value if present, otherwise throws an exception.
     * 
     * @throws NoSuchElementException if the value is absent.
     * @return The value if present.
     */
    inline def get: A = maybe match
        case Absent   => throw new NoSuchElementException("Maybe is Absent")
        case value: A => value

    /**
     * Gets the value if present, otherwise returns the default value.
     * 
     * @param default The default value to return if the value is absent.
     * @return The value if present, otherwise the default value.
     */
    inline def or(default: => A): A = maybe match
        case Absent   => default
        case value: A => value

    /**
     * Gets the value if present, otherwise returns the default `Maybe` value.
     * 
     * @param default The default `Maybe` value to return if the value is absent.
     * @return The value if present, otherwise the default `Maybe` value.
     */
    inline def orElse(default: Maybe[A]): Maybe[A] = maybe match
        case Absent => default
        case _      => maybe

    /**
     * Maps the value if present, otherwise returns absent.
     * 
     * @param f The function to apply to the value if present.
     * @tparam B The type of the result.
     * @return The mapped value if present, otherwise absent.
     */
    inline def map[B](f: A => B): Maybe[B] = maybe match
        case Absent   => Absent
        case value: A => f(value)

    /**
     * Flat maps the value if present, otherwise returns absent.
     * 
     * @param f The function to apply to the value if present.
     * @tparam B The type of the result.
     * @return The flat mapped value if present, otherwise absent.
     */
    inline def flatMap[B](f: A => Maybe[B]): Maybe[B] = maybe match
        case Absent   => Absent
        case value: A => f(value)

    /**
     * Folds the value if present, otherwise returns the result of `ifAbsent`.
     * 
     * @param ifAbsent The result to return if the value is absent.
     * @param ifPresent The function to apply to the value if present.
     * @tparam B The type of the result.
     * @return The result of `ifPresent` if the value is present, otherwise `ifAbsent`.
     */
    inline def fold[B](ifAbsent: => B, ifPresent: A => B): B = maybe match
        case Absent   => ifAbsent
        case value: A => ifPresent(value)

    /**
     * Filters the value if present and satisfies the predicate, otherwise returns absent.
     * 
     * @param predicate The predicate to apply to the value if present.
     * @return The value if present and satisfies the predicate, otherwise absent.
     */
    inline def filter(predicate: A => Boolean): Maybe[A] = maybe match
        case Absent                       => Absent
        case value: A if predicate(value) => value
        case _                            => Absent

    /**
     * Converts the `Maybe` to an `Option`.
     * 
     * @return `Some` if the value is present, `None` otherwise.
     */
    inline def toOption: Option[A] = maybe match
        case Absent   => None
        case value: A => Some(value)

    /**
     * Converts the `Maybe` to a `List`.
     * 
     * @return A list containing the value if present, otherwise an empty list.
     */
    inline def toList: List[A] = maybe match
        case Absent   => Nil
        case value: A => List(value)

    /**
     * Converts the `Maybe` to a `Seq`.
     * 
     * @return A sequence containing the value if present, otherwise an empty sequence.
     */
    inline def toSeq: Seq[A] = maybe match
        case Absent   => Nil
        case value: A => List(value)

    /**
     * Converts the `Maybe` to a `Set`.
     * 
     * @return A set containing the value if present, otherwise an empty set.
     */
    inline def toSet: Set[A] = maybe match
        case Absent   => Set.empty
        case value: A => Set(value)

    /**
     * Converts the `Maybe` to a `Map`.
     * 
     * @param f The function to apply to the value if present.
     * @tparam B The type of the result.
     * @return A map containing the value and the result of `f` if present, otherwise an empty map.
     */
    inline def toMap[B](f: A => B): Map[A, B] = maybe match
        case Absent   => Map.empty
        case value: A => Map(value -> f(value))

    /**
     * Converts the `Maybe` to an `Either`.
     * 
     * @param left The value to return if the `Maybe` is absent.
     * @tparam L The type of the left value.
     * @return `Right` if the value is present, `Left` otherwise.
     */
    inline def toEither[L](left: => L): Either[L, A] = maybe match
        case Absent   => Left(left)
        case value: A => Right(value)

    /**
     * Converts the `Maybe` to a `Try`.
     * 
     * @return `Success` if the value is present, `Failure` otherwise.
     */
    inline def toTry: Try[A] = maybe match
        case Absent   => Failure(new NoSuchElementException("Maybe is Absent"))
        case value: A => Success(value)

end extension
