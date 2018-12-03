import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DayTwo {
    static String input = "xrecqmdonskvzupalfkwhjctdb\n" +
            "xrlgqmavnskvzupalfiwhjctdb\n" +
            "xregqmyonskvzupalfiwhjpmdj\n" +
            "areyqmyonskvzupalfiwhjcidb\n" +
            "xregqpyonskvzuaalfiwhjctdy\n" +
            "xwegumyonskvzuphlfiwhjctdb\n" +
            "xregumymnskvzupalfiwhjctib\n" +
            "xregqmyonjkvzupalfvwijctdb\n" +
            "xrmgqmyonsdvzupalfiwhjcthb\n" +
            "xrpgqmyonskvzupalfiwhcitdb\n" +
            "xregvmysnsjvzupalfiwhjctdb\n" +
            "xregqsyonskvzupgqfiwhjctdb\n" +
            "qreuqmyonskvzupalfiwyjctdb\n" +
            "xrecqmyenskvzupalyiwhjctdb\n" +
            "xmegqmyonskvzhpalfcwhjctdb\n" +
            "xiegqmyonskvzupalfkwhjjtdb\n" +
            "xreaqmyofskfzupalfiwhjctdb\n" +
            "xregqmypnskvzupalmiwhjltdb\n" +
            "xretqmmonskvzupalfiwhwcfdb\n" +
            "xrexqmkonskvzupalfiwjjctdb\n" +
            "xrigqmyonskvgupplfiwhjctdb\n" +
            "xregqmyotskvzupalfywhjctdm\n" +
            "xcegmmyonsvvzupalfiwhjctdb\n" +
            "xrezqmypnskvznpalfiwhjctdb\n" +
            "xragqmyonskvzupblfiwajctdb\n" +
            "xregqmyonskvzwpapfiwhjctqb\n" +
            "xoegqmyoyskvzupaufiwhjctdb\n" +
            "xrcgqmyjnskvzupalfcwhjctdb\n" +
            "xregqmyonskvzudalfipajctdb\n" +
            "xsegqmyonsklzupalwiwhjctdb\n" +
            "xregqmyocskvduaalfiwhjctdb\n" +
            "xhegqmyfnskvzupalflwhjctdb\n" +
            "xregqmymnykvzupalfiwhjctdm\n" +
            "xregqmybnskvzupacfiwdjctdb\n" +
            "xaegqmlonskvzfpalfiwhjctdb\n" +
            "xoegtmyonskvzupalfiwhwctdb\n" +
            "xregqmyohskvzupaqfiwhjccdb\n" +
            "xoegqmyonstvzupalfiwhjctbb\n" +
            "mregnmyonskszupalfiwhjctdb\n" +
            "xreoqmycnskvzupalfiphjctdb\n" +
            "xregqmyocskvdupacfiwhjctdb\n" +
            "xregqmyonskvzupajqiahjctdb\n" +
            "xregqmyonslvwupalfiwhjcfdb\n" +
            "xregqmyonskvzapalfiwhqcthb\n" +
            "xrerqmyonskwzupalfiwhjctdt\n" +
            "xrefqmfonskvzupalfiwcjctdb\n" +
            "xregqmyonskvzupadfiwhjxedb\n" +
            "iregqhyonskvzupaliiwhjctdb\n" +
            "iregqmyotskvzucalfiwhjctdb\n" +
            "xrbgqmaonrkvzupalfiwhjctdb\n" +
            "xregqmyonskvzupalfixhdctdf\n" +
            "xrehqmyonskvzupalfiwijctdd\n" +
            "xvegqmyonskvzupaleuwhjctdb\n" +
            "xregqmyiyskvzupalfiwqjctdb\n" +
            "hregqmyonskvzupaxfiwhjptdb\n" +
            "xregamyznskbzupalfiwhjctdb\n" +
            "xreyqmyonskvgupalziwhjctdb\n" +
            "xregqmysnskvzupalfiwhgctdu\n" +
            "xojgqmyonskvzupalfiwbjctdb\n" +
            "xrkgqmyonskvlupalfiwhjcwdb\n" +
            "xregqmyonwkvxupalfiwajctdb\n" +
            "xregqmyonsuvzupalfjwhjcxdb\n" +
            "xregqmyonskgzucalfiwhjstdb\n" +
            "xaegqmyonfkvzupalfiwhjcttb\n" +
            "xlegqmyonskvzupazfiwhjctqb\n" +
            "xrejqmyonskvzqpaldiwhjctdb\n" +
            "xreguryonskvzupalfiwhjctdz\n" +
            "xregqsyoeskvzupalfiwhjctdt\n" +
            "xregqmyonskvzubalfirhjctdp\n" +
            "xrepqmymnskvzupadfiwhjctdb\n" +
            "xregqayonskvzuoalfichjctdb\n" +
            "xreqqmyonskvzunalfiwojctdb\n" +
            "xregqmyonsivzufalciwhjctdb\n" +
            "xregqqeonskvzupanfiwhjctdb\n" +
            "xoegqmyunskvzppalfiwhjctdb\n" +
            "xregqmyonskvzupalfqwhnftdb\n" +
            "xregqmyonskvzuralkiwhjcudb\n" +
            "xrwgqmymnskvzupalfiwhjcgdb\n" +
            "xvrgqmyonskvzupalfiwhjcthb\n" +
            "xregemyonskkzupalfiwhjctbb\n" +
            "xregqmyonsevzupalfiwhjjtdl\n" +
            "xregqmyonckvcupajfiwhjctdb\n" +
            "xregqmysnskvzunalfnwhjctdb\n" +
            "xreowmyonskvkupalfiwhjctdb\n" +
            "xregqmyonskvjupalfiwhjytdr\n" +
            "xregqmyonskyzupaffiwhmctdb\n" +
            "xrsgqmyonszvzupmlfiwhjctdb\n" +
            "xzegqmyonskvnupalfiwfjctdb\n" +
            "qregqmyonskvzupalfiwhrctjb\n" +
            "xpegqmyonsivzupqlfiwhjctdb\n" +
            "xregqmyoyskrzupalfiwhjctdx\n" +
            "xregqmyonsqvzupalfiwhjdndb\n" +
            "xregjmyonskvzppalfiwhjcgdb\n" +
            "xregqmyziskvzupalfiwhjctib\n" +
            "xregqmyonmkvbupalfiwhjckdb\n" +
            "xtegamyonskvzupalniwhjctdb\n" +
            "xregqpyonskvzhpwlfiwhjctdb\n" +
            "xvegqmfonskvzupalfiwhjcadb\n" +
            "xregqmyonskvzupaysiwhjctxb\n" +
            "xrejqmyonudvzupalfiwhjctdb\n" +
            "llegqmyonskvzbpalfiwhjctdb\n" +
            "tcegqmbonskvzupalfiwhjctdb\n" +
            "lregqmyohskvzupalfiwhjcttb\n" +
            "xrngqmcfnskvzupalfiwhjctdb\n" +
            "xregqmyonspvzuuplfiwhjctdb\n" +
            "xrxgqmyonslvzupalfiwhjctdo\n" +
            "xregqmyonskvzulalfuwhjdtdb\n" +
            "xregqmnonskvzupalfvwhjckdb\n" +
            "xregqbyfnskvzupaltiwhjctdb\n" +
            "xregqmyodsovzwpalfiwhjctdb\n" +
            "xregomyonskvhrpalfiwhjctdb\n" +
            "xregqmfdnskvzupalliwhjctdb\n" +
            "xregqmyonskvzupaabithjctdb\n" +
            "xrngamyonskvzupalfiwhjcttb\n" +
            "xrhgqmyonskvzupaldifhjctdb\n" +
            "xrygzmyonskvzupatfiwhjctdb\n" +
            "xregqmyonskvzupiqtiwhjctdb\n" +
            "xregqmyonfkvzupalfiwxjcsdb\n" +
            "xregqsyunskvzupalfiwhjctde\n" +
            "xrzgqmyolskvzupasfiwhjctdb\n" +
            "xgegqmyoyskvzupalfiwfjctdb\n" +
            "xrvgqlyohskvzupalfiwhjctdb\n" +
            "xregcmyonskvzuprlyiwhjctdb\n" +
            "xregqmyonskvwjpalfiwsjctdb\n" +
            "xrfgqmyonskvzupalfidhactdb\n" +
            "xcegqmyonwkvzdpalfiwhjctdb\n" +
            "nregqmyrnskvzupalciwhjctdb\n" +
            "xcegqmyonskvzvpalfiwhjctdj\n" +
            "xregqmyonskvzupqssiwhjctdb\n" +
            "xregcmyonskvzupalfinhjutdb\n" +
            "xregqmyonskvzupzlfiwcjctnb\n" +
            "xnegqmyozskvzbpalfiwhjctdb\n" +
            "xregvmponskvzupalfiwhsctdb\n" +
            "xregqmyonskvpupalqichjctdb\n" +
            "xreqqmyonskvzupauuiwhjctdb\n" +
            "xregqryonskvzupatfiwhjctyb\n" +
            "hregqmyonokvzupalfiwhmctdb\n" +
            "xreuqmionckvzupalfiwhjctdb\n" +
            "xregqmyoiskvzupanfiwhjntdb\n" +
            "xrdgqmronskvzupaluiwhjctdb\n" +
            "xadgqmyunskvzupalfiwhjctdb\n" +
            "eregqmzonskvzupakfiwhjctdb\n" +
            "xiegqmyonskvnupblfiwhjctdb\n" +
            "yregqmzonskvzupalfiwhjotdb\n" +
            "xregqmyonskvjupalfiwhjhtvb\n" +
            "wregqmyonskvzzprlfiwhjctdb\n" +
            "xregqmyovskvzupalgiuhjctdb\n" +
            "xregqmyonskjzupelfuwhjctdb\n" +
            "xregqmysuskvpupalfiwhjctdb\n" +
            "xrebqkyonskvzupalfiwpjctdb\n" +
            "xregcmyonskvzipalfiwhjcttb\n" +
            "xregqmyonskdyupalfiwgjctdb\n" +
            "xregcmyonskvzupalfiwijctnb\n" +
            "xregqmyonsovdupalfrwhjctdb\n" +
            "xregqmaonskvzupalnkwhjctdb\n" +
            "xregqmysnfkvzupalfiwhictdb\n" +
            "xregqmyonswvzupalfiyhjctdf\n" +
            "xreoqmyrnskvzupalfihhjctdb\n" +
            "tregqmydnskvzupalfizhjctdb\n" +
            "xregxmyonykvzupalfnwhjctdb\n" +
            "xzegqnyonskuzupalfiwhjctdb\n" +
            "xregqmfonszvvupalfiwhjctdb\n" +
            "xrerqmyjnskvzupalfiwhpctdb\n" +
            "xregqmyanskvzupalffphjctdb\n" +
            "rregqmyogskvzupalfiehjctdb\n" +
            "xrpgqmyonspvzupalfiwgjctdb\n" +
            "xuegqmppnskvzupalfiwhjctdb\n" +
            "xregqmyonskvzqpalsiwhjhtdb\n" +
            "xregqzyonskvzkpalfiwujctdb\n" +
            "xrdgqmyonskvzupglfiwhjctdu\n" +
            "xregqmyonskqzupahciwhjctdb\n" +
            "treqqmyonskvzupalfiwhjcqdb\n" +
            "vlegqmyonskvzupalfiwhjwtdb\n" +
            "xregjmyonskviupglfiwhjctdb\n" +
            "xreggmyanskvzupalfiwhjcydb\n" +
            "xregqmybnskvzuprlfiwhjmtdb\n" +
            "xrsgqmyonskizupagfiwhjctdb\n" +
            "xregqmyenskvzupalfvwhjctib\n" +
            "lrygqmyonsrvzupalfiwhjctdb\n" +
            "xregqmjonskvqupalfiwhjctdu\n" +
            "xregqmyonsknzmpzlfiwhjctdb\n" +
            "xregqmyonhkvzupllfiwhjctdz\n" +
            "xregqmronskvdumalfiwhjctdb\n" +
            "xrpgqmyonskvzupalfhwhjhtdb\n" +
            "xfegqmeonskvzupasfiwhjctdb\n" +
            "xregqqyonskvzrpalfiwijctdb\n" +
            "xretqmmonskvzupalfiwhjcfdb\n" +
            "xregqmyonskvznpalniwhjztdb\n" +
            "xregqmyqnskvzuoalfiwhhctdb\n" +
            "xregqmyonsbvzupalviwhjxtdb\n" +
            "xregqmyonskvzupazmiwhhctdb\n" +
            "xregqmyosskvzupalflwhjctdw\n" +
            "xtegqmyonskvzupamciwhjctdb\n" +
            "xregamyonskvzbpalfiwhqctdb\n" +
            "xregqmgonskvzupalfiwhictxb\n" +
            "xregqmyonskvjupvlfnwhjctdb\n" +
            "xrthqmyonskvzupalfiwhjctub\n" +
            "xrexqmyoyskvzupalfiwhjcadb\n" +
            "xvegqmyonskvxupalfiwhjztdb\n" +
            "xregqmyonskgzupalhiwhjptdb\n" +
            "xregqmysnskvzufalpiwhjctdb\n" +
            "xregqmyonskvbipalfighjctdb\n" +
            "xregqmyonskvzupylfiwhjwvdb\n" +
            "gregqmyonskvzupalfikhjctdt\n" +
            "ujegqmyonskvzupalfiwhjctlb\n" +
            "nreqqmyonskjzupalfiwhjctdb\n" +
            "xregqmyonskvzupanfbwhjchdb\n" +
            "xregqyyoeskwzupalfiwhjctdb\n" +
            "xregqmyokskvzgpalfiwhnctdb\n" +
            "lregqmyonskvzupalfawsjctdb\n" +
            "xtegqmyonskvzmpalfiwhjctmb\n" +
            "xtegqvyonskvzupalfiwhjdtdb\n" +
            "xpegqpyonekvzupalfiwhjctdb\n" +
            "qregqmyonskvzupalfiwmjctdn\n" +
            "xregqnyosskvzupalfibhjctdb\n" +
            "xregqmyonsknzupalflwhjctfb\n" +
            "xregqmxoyskvzuealfiwhjctdb\n" +
            "xregdmyoeskvzupalfiwhfctdb\n" +
            "xremmmyonskvzupalfiwhxctdb\n" +
            "xregqmconskvzupylfuwhjctdb\n" +
            "xregqmyonskvzupawiiwhictdb\n" +
            "xlegsmyonskvzupalfiwhbctdb\n" +
            "xregqmyonsavzopalyiwhjctdb\n" +
            "xregqmyonskczupalfibhvctdb\n" +
            "xregqmyonskvzvpalfiunjctdb\n" +
            "xregqmyonskvdupalfiwhjczdp\n" +
            "xregqmyonskvzupklfswhhctdb\n" +
            "xrelqmyonskvzupalyiwhjctdi\n" +
            "xrcgqmyonskvzupalfieqjctdb\n" +
            "xregqmnonskvzupacfewhjctdb\n" +
            "xrwgqmyonskvzuealfiwhcctdb\n" +
            "xregqiyonsevzmpalfiwhjctdb\n" +
            "xregqmyonjyvzupalfiwhjckdb\n" +
            "xregqmyonyklzupadfiwhjctdb\n" +
            "xregqmyanskvzupolfiwhjctpb\n" +
            "xdbgqmyonskvzupslfiwhjctdb\n" +
            "xregqmhonykvzupalfawhjctdb\n" +
            "xregqmqonsivzupalfifhjctdb\n" +
            "xregqgyonsrvzupalfiwhjctib\n" +
            "xregqmyofskvzupalfiwlfctdb\n" +
            "xregqmyovskvzupllftwhjctdb\n" +
            "xregqmyonskvzupaciiwhuctdb\n" +
            "xregqmyonsdvzuhalfiwhjhtdb\n" +
            "xreiqmyonskvzupalfiwhncldb\n" +
            "xregqmyongkvzugalfiwhjctxb\n" +
            "xregqsyonskvzrpmlfiwhjctdb\n" +
            "xrogqmyonskvzxpalfiwhbctdb\n" +
            "xregqmkonskvzuqalfiwhjptdb\n" +
            "xregqmyonskvvxpalfiwhactdb\n" +
            "xregqmyonskvzupsliiwhwctdb";

    public static ArrayList<String> ids(String input) {
        ArrayList<String> listOfIds = new ArrayList<String>();
        listOfIds.addAll(Arrays.asList(input.split("\n")));
        return listOfIds;
    }

    static void mapOfIds(String input) {
        int twoTimesRepetedChars = 0;
        int threeTimesRepeatedChars = 0;
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for (String id :
                ids(input)) {
            temp = extractNumberOfRepetetiveChars(id);
            if (temp.containsValue(2)) {
                twoTimesRepetedChars = twoTimesRepetedChars + 1;
            }
            if (temp.containsValue(3)) {
                threeTimesRepeatedChars = threeTimesRepeatedChars + 1;
            }
            temp.clear();
        }

        System.out.println(twoTimesRepetedChars*threeTimesRepeatedChars);
    }

    static Map<String, Integer> extractNumberOfRepetetiveChars(String string) {
        Map<String, Integer> temp = new HashMap<String, Integer>();
        for (int i = 0; i<string.length(); i++) {
            if (temp.containsKey(String.valueOf(string.charAt(i)))) {
                temp.put(String.valueOf(string.charAt(i)), temp.get(String.valueOf(string.charAt(i))) + 1);
            } else temp.put(String.valueOf(string.charAt(i)), 1);
        }
        return temp;
    }


    static void dayTwoPartOne() {
        mapOfIds(input);
    }

    static String getCharacterFromString(int index, String id) {
        return String.valueOf(id.charAt(index));
    }

    static boolean compareTwoStrings(int index, String stringOne, String stringTwo) {
        return getCharacterFromString(index, stringOne).equalsIgnoreCase(getCharacterFromString(index, stringTwo));
    }

    static boolean areStringsAlmostTheSame(String stringOne, String stringTwo) {
        boolean result = false;
        int indexOfDifferenceMax1 = 0;
        for (int i = 0; i<stringOne.length(); i++) {
            if (compareTwoStrings(i, stringOne, stringTwo) || (indexOfDifferenceMax1 <=1 && !compareTwoStrings(i, stringOne, stringTwo))) {
                result = true;
                if (!compareTwoStrings(i, stringOne, stringTwo)) {
                    indexOfDifferenceMax1 = indexOfDifferenceMax1 + 1;
                }
            } else indexOfDifferenceMax1 = indexOfDifferenceMax1 + 1;
            if (indexOfDifferenceMax1 > 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    static void dayTwoPartTwo() {
        ArrayList<String> listOfIds = ids(input);
        String string;
        int index = 0;

        for (int i = 0; i<listOfIds.size(); i++) {
            index = i + 1;
            do {
                if (areStringsAlmostTheSame(listOfIds.get(i), listOfIds.get(index))) {
                    System.out.println("The first word is " + listOfIds.get(i));
                    System.out.println("The second word is " + listOfIds.get(index));
                    break;
                }
                index = index + 1;
            } while (index < listOfIds.size() - 1);
        }
    }


    public static void main(String[] args) {
        dayTwoPartTwo();
    }
}
