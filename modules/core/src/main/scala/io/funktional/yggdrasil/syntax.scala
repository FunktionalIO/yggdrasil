// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

object syntax:
    object all:
        export maybe.*

    object maybe:
        extension [A](inline value: A)
            /**
             * Converts the value to a `Maybe`.
             *
             * @return The `Maybe` instance containing the value.
             */
            inline def maybe: Maybe[A] = Maybe.just(value)
        end extension

        extension [A](inline option: Option[A])
            /**
             * Converts the option to a `Maybe`.
             *
             * @return The `Maybe` instance representing the option.
             */
            inline def maybe: Maybe[A] = Maybe(option)
        end extension
    end maybe
end syntax
