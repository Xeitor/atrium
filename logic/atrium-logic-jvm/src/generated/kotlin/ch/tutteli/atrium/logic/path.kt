//---------------------------------------------------
//  Generated content, modify:
//  logic/generateLogic.gradle
//  if necessary - enjoy the day 🙂
//---------------------------------------------------

@file:Suppress(
    // TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed
    "JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE"
)

package ch.tutteli.atrium.logic

import ch.tutteli.atrium.assertions.Assertion
import ch.tutteli.atrium.creating.AssertionContainer
import ch.tutteli.atrium.logic.creating.transformers.FeatureExtractorBuilder
import java.nio.charset.Charset
import java.nio.file.Path

fun <T : Path> AssertionContainer<T>.startsWith(expected: Path): Assertion = _pathImpl.startsWith(this, expected)
fun <T : Path> AssertionContainer<T>.startsNotWith(expected: Path): Assertion = _pathImpl.startsNotWith(this, expected)
fun <T : Path> AssertionContainer<T>.endsWith(expected: Path): Assertion = _pathImpl.endsWith(this, expected)
fun <T : Path> AssertionContainer<T>.endsNotWith(expected: Path): Assertion = _pathImpl.endsNotWith(this, expected)

fun <T : Path> AssertionContainer<T>.exists(): Assertion = _pathImpl.exists(this)
fun <T : Path> AssertionContainer<T>.existsNot(): Assertion = _pathImpl.existsNot(this)

fun <T : Path> AssertionContainer<T>.isReadable(): Assertion = _pathImpl.isReadable(this)
fun <T : Path> AssertionContainer<T>.isWritable(): Assertion = _pathImpl.isWritable(this)
fun <T : Path> AssertionContainer<T>.isExecutable(): Assertion = _pathImpl.isExecutable(this)
fun <T : Path> AssertionContainer<T>.isRegularFile(): Assertion = _pathImpl.isRegularFile(this)
fun <T : Path> AssertionContainer<T>.isDirectory(): Assertion = _pathImpl.isDirectory(this)

fun <T : Path> AssertionContainer<T>.hasSameTextualContentAs(targetPath: Path, sourceCharset: Charset, targetCharset: Charset): Assertion =
    _pathImpl.hasSameTextualContentAs(this, targetPath, sourceCharset, targetCharset)

fun <T : Path> AssertionContainer<T>.hasSameBinaryContentAs(targetPath: Path): Assertion = _pathImpl.hasSameBinaryContentAs(this, targetPath)

fun <T : Path> AssertionContainer<T>.fileName(): FeatureExtractorBuilder.ExecutionStep<T, String> = _pathImpl.fileName(this)
fun <T : Path> AssertionContainer<T>.extension(): FeatureExtractorBuilder.ExecutionStep<T, String> = _pathImpl.extension(this)
fun <T : Path> AssertionContainer<T>.fileNameWithoutExtension(): FeatureExtractorBuilder.ExecutionStep<T, String> = _pathImpl.fileNameWithoutExtension(this)
fun <T : Path> AssertionContainer<T>.parent(): FeatureExtractorBuilder.ExecutionStep<T, Path> = _pathImpl.parent(this)
fun <T : Path> AssertionContainer<T>.resolve(other: String): FeatureExtractorBuilder.ExecutionStep<T, Path> = _pathImpl.resolve(this, other)
