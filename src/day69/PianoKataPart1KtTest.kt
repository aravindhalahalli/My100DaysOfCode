package day69

import org.junit.Test

import org.junit.Assert.*

class PianoKataPart1KtTest {

    @Test
    fun exampleTests() {
        assertEquals("white", blackOrWhiteKey(1))
        assertEquals("black", blackOrWhiteKey(5))
        assertEquals("black", blackOrWhiteKey(12))
        assertEquals("white", blackOrWhiteKey(42))
        assertEquals("white", blackOrWhiteKey(88))
        assertEquals("white", blackOrWhiteKey(89))
        assertEquals("white", blackOrWhiteKey(92))
        assertEquals("black", blackOrWhiteKey(100))
        assertEquals("white", blackOrWhiteKey(111))
        assertEquals("black", blackOrWhiteKey(200))
        assertEquals("white", blackOrWhiteKey(2017))
    }
}