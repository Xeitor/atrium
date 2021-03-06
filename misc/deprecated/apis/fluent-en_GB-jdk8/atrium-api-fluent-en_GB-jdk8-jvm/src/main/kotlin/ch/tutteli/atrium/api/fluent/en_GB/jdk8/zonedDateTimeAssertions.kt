//TODO remove file with 1.0.0
@file:Suppress(
    "DEPRECATION",
    /* TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed */
    "JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE",
    /* remove once https://youtrack.jetbrains.com/issue/KT-34257 is fixed */
    "FINAL_UPPER_BOUND"
)

package ch.tutteli.atrium.api.fluent.en_GB.jdk8

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.domain.builders.zonedDateTime
import java.time.DayOfWeek
import java.time.ZonedDateTime

/**
 * Creates an [Expect] for the property [ZonedDateTime.year][ZonedDateTime.getYear] of the subject of the assertion,
 * so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.year", "ch.tutteli.atrium.api.fluent.en_GB.year")
)
val <T : ZonedDateTime> Expect<T>.year: Expect<Int>
    get() = ExpectImpl.zonedDateTime.year(this).getExpectOfFeature()

/**
 * Expects that the property [ZonedDateTime.year][ZonedDateTime.getYear] of the subject of the assertion
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of the assertion.
 *
 * @return An [Expect] for the current subject of the assertion.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.year(assertionCreator)", "ch.tutteli.atrium.api.fluent.en_GB.year")
)
fun <T : ZonedDateTime> Expect<T>.year(assertionCreator: Expect<Int>.() -> Unit): Expect<T> =
    ExpectImpl.zonedDateTime.year(this).addToInitial(assertionCreator)

/**
 * Creates an [Expect] for the property [ZonedDateTime.monthValue][ZonedDateTime.getMonthValue]
 * of the subject of the assertion, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.month", "ch.tutteli.atrium.api.fluent.en_GB.month")
)
val <T : ZonedDateTime> Expect<T>.month: Expect<Int>
    get() = ExpectImpl.zonedDateTime.month(this).getExpectOfFeature()

/**
 * Expects that the property [ZonedDateTime.monthValue][ZonedDateTime.getMonthValue] of the subject of the assertion
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of the assertion.
 *
 * @return An [Expect] for the current subject of the assertion.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.month(assertionCreator)", "ch.tutteli.atrium.api.fluent.en_GB.month")
)
fun <T : ZonedDateTime> Expect<T>.month(assertionCreator: Expect<Int>.() -> Unit): Expect<T> =
    ExpectImpl.zonedDateTime.month(this).addToInitial(assertionCreator)

/**
 * Creates an [Expect] for the property [ZonedDatetime.dayOfWeek][ZonedDateTime.getDayOfWeek]
 * of the subject of the assertion, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.dayOfWeek", "ch.tutteli.atrium.api.fluent.en_GB.dayOfWeek")
)
val <T : ZonedDateTime> Expect<T>.dayOfWeek: Expect<DayOfWeek>
    get() = ExpectImpl.zonedDateTime.dayOfWeek(this).getExpectOfFeature()

/**
 * Expects that the property [ZonedDatetime.dayOfWeek][ZonedDateTime.getDayOfWeek] of the subject of the assertion
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of the assertion.
 *
 * @return An [Expect] for the current subject of the assertion.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.dayOfWeek(assertionCreator)", "ch.tutteli.atrium.api.fluent.en_GB.dayOfWeek")
)
fun <T : ZonedDateTime> Expect<T>.dayOfWeek(assertionCreator: Expect<DayOfWeek>.() -> Unit): Expect<T> =
    ExpectImpl.zonedDateTime.dayOfWeek(this).addToInitial(assertionCreator)

/**
 * Creates an [Expect] for the property [ZonedDateTime.dayOfMonth][ZonedDateTime.getDayOfMonth]
 * of the subject of the assertion, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.day", "ch.tutteli.atrium.api.fluent.en_GB.day")
)
val <T : ZonedDateTime> Expect<T>.day: Expect<Int>
    get() = ExpectImpl.zonedDateTime.day(this).getExpectOfFeature()

/**
 * Expects that the property [ZonedDateTime.dayOfMonth][ZonedDateTime.getDayOfMonth] of the subject of the assertion
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of the assertion.
 *
 * @return An [Expect] for the current subject of the assertion.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.9.0
 */
@Deprecated(
    "Use the function from the normal jvm module; the jdk8 extension will be removed with 1.0.0",
    ReplaceWith("this.day(assertionCreator)", "ch.tutteli.atrium.api.fluent.en_GB.day")
)
fun <T : ZonedDateTime> Expect<T>.day(assertionCreator: Expect<Int>.() -> Unit): Expect<T> =
    ExpectImpl.zonedDateTime.day(this).addToInitial(assertionCreator)
