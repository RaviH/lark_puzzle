package puzzle

import spock.lang.Specification

class LarkPuzzleTest extends Specification {

    def larkPuzzle = new LarkPuzzle()

    def "happy path"() {
        expect:
        larkPuzzle.printLine(Constants.NICE_VALID_INPUT)
    }

    def "4 buttons"() {
        expect:
        larkPuzzle.printLine(Constants.INPUT_WITH_FOUR_BUTTONS)
    }

    def "long text in line"() {
        expect:
        larkPuzzle.printLine(Constants.INPUT_WITH_LONG_TEXT_IN_LINE)
    }

    def "long text in button"() {
        expect:
        larkPuzzle.printLine(Constants.INPUT_WITH_LONG_TEXT_IN_BUTTON)
    }

    def "multiple issues"() {
        expect:
        larkPuzzle.printLine(Constants.MULTIPLE_ISSUES)
    }

    def "null string"() {
        expect:
        larkPuzzle.printLine(null)
    }

    def "empty string"() {
        expect:
        larkPuzzle.printLine("")
    }
}
