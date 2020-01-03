package puzzle;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

class Constants {

    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLACK = "\u001B[30m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    final static String NICE_VALID_INPUT =
            "Hi how are you?\n" +
                    "\tGood\n" +
                    "\t\tGreat to hear\n" +
                    "\t\tSince you're feeling good, do you want to eat ice cream?\n" +
                    "\t\t\tYes\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tOK\n" +
                    "\t\tOK\n" +
                    "\tBad\n" +
                    "\t\tSorry to hear that\n" +
                    "\t\tSince you're feeling bad, do you want to eat ice cream?\n" +
                    "\t\t\tSure\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo way\n" +
                    "\t\t\t\tOk, some other time";
    final static String INPUT_WITH_FOUR_BUTTONS =
            "Hi how are you?\n" +
                    "\tGood\n" +
                    "\t\tGreat to hear\n" +
                    "\t\tSince you're feeling good, do you want to eat ice cream?\n" +
                    "\t\t\tYes\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tOK\n" +
                    "\t\tOK\n" +
                    "\tBad\n" +
                    "\t\tSorry to hear that\n" +
                    "\t\tSince you're feeling bad, do you want to eat ice cream?\n" +
                    "\t\t\tSure\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo way\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tFourth Button\n";
    final static String INPUT_WITH_LONG_TEXT_IN_LINE =
            "Hi how are you?\n" +
                    "\tGood\n" +
                    "\t\tGreat to hear\n" +
                    "\t\tSince you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?\n" +
                    "\t\t\tYes\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tOK\n" +
                    "\t\tOK\n" +
                    "\tBad\n" +
                    "\t\tSorry to hear that\n" +
                    "\t\tSince you're feeling bad, do you want to eat ice cream?\n" +
                    "\t\t\tSure\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo way\n" +
                    "\t\t\t\tOk, some other time";
    final static String MULTIPLE_ISSUES =
            "Hi how are you?\n" +
                    "\tGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGood\n" +
                    "\t\tGreat to hear\n" +
                    "\t\tSince you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?Since you're feeling good, do you want to eat ice cream?\n" +
                    "\t\t\tYes\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tOK\n" +
                    "\t\tOK\n" +
                    "\tBad\n" +
                    "\t\tSorry to hear that\n" +
                    "\t\tSince you're feeling bad, do you want to eat ice cream?\n" +
                    "\t\t\tSure\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tFourth Button\n";
    final static String INPUT_WITH_LONG_TEXT_IN_BUTTON =
            "Hi how are you?\n" +
                    "\tGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGoodGood\n" +
                    "\t\tGreat to hear\n" +
                    "\t\tSince you're feeling good, do you want to eat ice cream?\n" +
                    "\t\t\tYes\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo\n" +
                    "\t\t\t\tOk, some other time\n" +
                    "\tOK\n" +
                    "\t\tOK\n" +
                    "\tBad\n" +
                    "\t\tSorry to hear that\n" +
                    "\t\tSince you're feeling bad, do you want to eat ice cream?\n" +
                    "\t\t\tSure\n" +
                    "\t\t\t\tHere's your ice cream!\n" +
                    "\t\t\tNo way\n" +
                    "\t\t\t\tOk, some other time";
    static ColoredPrinter GOOD_BUTTON = new ColoredPrinter.Builder(1, false)
            .background(Ansi.BColor.WHITE)
            .foreground(Ansi.FColor.GREEN)
            .build();
    static ColoredPrinter GOOD_LINE = new ColoredPrinter.Builder(1, false)
            .background(Ansi.BColor.WHITE)
            .foreground(Ansi.FColor.BLACK)
            .build();
    static ColoredPrinter ERROR = new ColoredPrinter.Builder(1, false)
            .background(Ansi.BColor.WHITE)
            .foreground(Ansi.FColor.RED)
            .build();
}
