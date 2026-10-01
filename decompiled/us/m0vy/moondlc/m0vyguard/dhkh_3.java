/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fi.iki.elonen.NanoHTTPD
 *  fi.iki.elonen.NanoHTTPD$IHTTPSession
 *  fi.iki.elonen.NanoHTTPD$Method
 *  fi.iki.elonen.NanoHTTPD$Response
 *  fi.iki.elonen.NanoHTTPD$Response$IStatus
 *  fi.iki.elonen.NanoHTTPD$Response$Status
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import fi.iki.elonen.NanoHTTPD;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkh;
import us.m0vy.moondlc.m0vyguard.yf;

public class dhkh_3
extends NanoHTTPD
implements tthy {
    private final File shzgh_2 = new File(System.getProperty(dhkh_3.cqrhjxrlg("땮გ뚤掇辫헟①辇", -1864018786 - 317415327, Integer.rotateLeft(0x9C9B726F ^ 0x4387EBA4, 28), Integer.reverse(-1567874260) ^ 0xA328E03D)) + "/MoonDlc/Configi");
    private String bma;
    private boolean rha_2;
    private static final int rlk = -602137936;
    private static final int shdj_2 = 1927724837;
    private static final int rdb = -1682158290;
    private static final int sal = 438061804;
    private static final int rnninu53cdbjp = -1332219717;
    private static final int ehfx8djd = -850459382;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int oercskt4ico11;

    public dhkh_3() throws IOException {
        super(Integer.reverse(2048371530) ^ 0x52D5FE46);
        if (!this.shzgh_2.exists() && !this.shzgh_2.mkdirs()) {
            throw new IOException("Failed to create configs directory: " + String.valueOf(this.shzgh_2));
        }
        this.start(Integer.rotateLeft(0x49609856 ^ 0x49478856, 23), false);
        System.out.println("Server started on port 5656, configs in " + this.shzgh_2.getAbsolutePath());
    }

    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession iHTTPSession) {
        Object object;
        int n = 774556671;
        n = Integer.rotateLeft(n * -407852709, 7) ^ 0xB09F58B0;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE110CDFF;
        if ((n2 ^ n) != -518992385) {
            int cfr_ignored_0 = (0xCF3A0600 ^ n) - -1869418843;
        }
        if (NanoHTTPD.Method.POST.equals((Object)iHTTPSession.getMethod())) {
            try {
                object = new HashMap();
                iHTTPSession.parseBody(object);
                String string = (String)object.get(dhkh_3.cqrhjxrlg("耤ꩴ嘼ｎ", Integer.rotateLeft(0x98DA0714 ^ 0xBDF57A27, 22), 0x6183A915 ^ 0x8F41EB76, -318678015 - -663671466));
                if (string != null) {
                    String string2 = (String)iHTTPSession.getParms().get(dhkh_3.cqrhjxrlg("珺薦\ud9c1㎏", 0xE0257870 ^ 0x603291A9, -1902397756 + -1313632765, -939019242 + 1284012693));
                    if (string2 == null || string2.isEmpty()) {
                        string2 = dhkh_3.avoj8evfw("咘\u0014⋼혏迪感햾ၰ뙛伹", -2126609958 + 2087939197, 1259555593 - 1312378770, Integer.reverse(430880287) ^ 0xECFD5B33);
                    }
                    this.bma = string2;
                    this.rha_2 = true;
                    File file = new File(this.shzgh_2, string2);
                    Files.copy(dhkh_3.he0u6fnb74(string, new String[0]), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Config received, waiting for " + file.getName() + " to appear");
                    long l = System.currentTimeMillis();
                    while (!dhkh_3.mohal2b7gi(file) && System.currentTimeMillis() - l < (0x8B166F4B954F42CBL ^ 0x8B166F4B954F5143L)) {
                        try {
                            Thread.sleep(0xE656199B958A50EL ^ 0xE656199B958A53CL);
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                            break;
                        }
                    }
                    if (!file.exists()) {
                        return dhkh_3.newFixedLengthResponse((NanoHTTPD.Response.IStatus)NanoHTTPD.Response.Status.INTERNAL_ERROR, (String)dhkh_3.coso9s5gcyar2fl("萯⫤̣夋딺ѝ\uda2f㙶插", 0x266C34C7 ^ 0xED844704, 2047448699 - 1123441459, 0x7FEF82A5 ^ 0x6B7FAC0E), (String)dhkh_3.cqrhjxrlg("㈧曽ꀛ䧠῵䩕ꙻ聵쥔┬罜諯囌²৫喽뿗橻헄䁢梞铞䊕ᘒ䒥ꤎ痸쌞⩺瘶葎夬̶媍뚣擽\ud9ac㗓掻駄乨ᢎ䲘ꍽ稙컢", -1290793463 - -1356345342, -1381275187 + -1275938938, 0xFD92D59F ^ 0xE902FB34));
                    }
                    System.out.println("File confirmed, loading config " + file.getName());
                    String string3 = string2;
                    if (string3.endsWith(dhkh_3.qrzwv0qnv8e8m("䆛꿓﯎ɤ꾞", 0x11D21327 ^ 0xBDCC158A, 0xFCA4BCE5 ^ 0x94DFF1E6, 0x4124D4A5 ^ 0x55B4FA0E))) {
                        string3 = string3.substring(0, dhkh_3.onggeefoup(string3, 0x44E9B91E ^ 0x44E9B930));
                    }
                    dhkh_3.q5av7r34(bhdh.khsb(), string3);
                    return dhkh_3.ocnpbkhj1(dhkh_3.zlnq3tb680x15(dhkh_3.cqrhjxrlg("ꞹ厔ಎ㊘軍棳㓋췋ᧂ뎯乊ᨻ", -534687118 + -1235422403, -2090462585 + 137916901, 0x89A7892D ^ 0x9D37A786), dhkh_3.cp41aq1n8uc("貹㕕୳噑ꉋ౫헤ℙ篸阆∞ﰔᔮ", 0x2511223F ^ 0xC4B9B80, Integer.reverse(781000012) ^ 0xFB156248, dhkh_3.wzdzwg6j1f3(906995972) ^ 0x3405DEC7)).concat(dhkh_3.qsdsb9dvst("속걡痹쇢⯘苗岩Į\udb44", -2023197776 + -201180689, 217201226 + 1618035571, -1846180841 + -2103793004)));
                }
            }
            catch (Exception exception) {
                return dhkh_3.newFixedLengthResponse((String)("Upload error: " + exception.getMessage()));
            }
        }
        this.rha_2 = false;
        object = dhkh_3.cqrhjxrlg("밈๠휚믟洨飐㰰隽䋛겊᡹쎂깤短莚ⶁ蒸廜뜦̅\udd3b롕搯鹹㞭鷡䤇꒴Ṇ쩱ꋞ絥袊⑩ﶇ訤厷붿৬풍뺧櫀錣㵕鑽䘸ꩊ᏶씚꧳琌虆⩀蒻奎돎آ\ud9d7뎡旆馑㓪骺佑ꔵ᥿큰ꙅ稥輄◳聾遙嘔뫤ຊ핿뢓灵閇㦋閑䆩냊ᚹ싀꼤異脤〖艞忿딜ď뚰戋齭㒕龖䮚ꇱῆ쮣ꇁ肣賜⋭＾謹充쀭ౝ툿뼙欗酏䃾鋩䚏ꭿ჈쟎꯲爡蟨⮛袔峡늢ܤ\udb42넰桅鰳㈆鬒䷡ꠀᳩ츇Ꜻ窶첐➲ﱷ趇埂ﯫඛ\ud8b5볷溤흇㬡顜䐘᝞쏾괛磱쐏⻿苵峼ώ\ude25략換\udda5㣧黐䫎ᵶ줘ꐛ縂쩭⌉﷧褍哮﹘ਙ튽뵼梇푩㶞鏡䖳ᓛ운꫅猳씕⥈蘾婛Ԏ\ud9b6둕昽\uda30㍸饮侪ᦚ쿍ꖩ秘킰⛌請轾啔樓္혃멨潄헉㤐阳䋴ᕐ삮뀳痕쇞⾂膦惆˗\udf17딂愾㘦龷䬆‮쳸ꈈ缾쫭ℴ￙诞净ﾋ௤퇍삿泋틋㽎酖䡲ሼ윙꬚焤좪Ɽ蛇嬴ߞ\udbc0뉭枨\udbccㆮ鳟介ᭊ촫ꡗ簳칚✑ﭦ趱堍ﳪซ흡몔沐ퟛ㰁鞉䏶ᢛ쒂꺬睃쌡ⵄ萘幖ϴ\udd03룶摝\udeb4㚚鲎䥿ṻ짝ꎲ綛즂⓭ﺏ諨匃ﴰी푌빨樸팈㷼铷䘖ኔ앮ꢜ瑽엜⨸藇妣ڭ\udad1덡政\ud91f㐼騎侥᧼퀜ꘗ稇콣⒆盧迆嘩遼ྒ햻맇烳횩㫺锟䄼ᘎ숨꼆痦섞〗花廒Ý뗓戢\udfed㖏ꂃ䲪Ὓ쭸ꄸ聀찢∝ﾴ譋兎\u0010ೳ퉉뼃櫆털㿓釽䞏ᇂ좹곞狘읮⬾蠫屃ݙ\udb5d넆梹\udc14㊻鬪䳈᯽츯꟨箃춧⢿ﲵ躼坱﬎൥\ud84f뱥渙휅㭪顒䒩᜸싓굤瞲쑡⶘莩巜ӹ\udeeb뜎捴\udd09㡬鹓䨛ᵒ즩ꑆ纸쩓⌢ﲰ襮厞﹤ঃ폛붒槾풾㻚鍈䔹ᐞ옑ꨮ猟얲⥬虓媢ԯ\ud8cc둷斏\uda6d㏋馰僂ᫀ켺ꔃ礞큃☮臭追唃離၈횈멽漯퓌㤣队䇽ᗱ솎냥盁슻⽋脀怰ɩ\udf46떸慓㙽麅䭰⁹쮖ꆅ翫쮎↣Ë貱勁％ପ텫쀒汩툆㾸釤䠱ሔ윮ꪎ煼입⮙蟚宬ࢺ\udc83늞权\udb24ㅞ鱋丶ᮈ쵽ꢯ籌캣⛊וּ貐垝ﮑิퟥ뮖淡\ud8c9㳆靁䌒᠆쑸긓瞢쌪ⷦ蓷市˗\udccd럑搾\uddd5㞜揞鶙䦞ừ䪒ꍩ絋줹⑋繯詪另ﴈ৷吂뺯橗틈㳑椾鎀䙿Ꮃ䖞ꦀ瓫욒⫩猆蔺奒ٶ娨댞旬\ud91f㓻易驆仁ᢖ偡ꖂ稢쾴▀秫邒囩惘ླྀ啃뤣灹혫㩅濭锍䆯ᙎ䉑꽾璈센⿮瘹臖往ƒ惩뛄抷\udf41㔦慸ꀽ䰁Ἃ䯱ꄞ耉찒⊴绐謶僖iஎ刻뿁殒퇩䂆泸銓䝢ᄠ䡔걮牙쟽⬖焘蠎峹ܧ嫔넹柂\udc70ㆣ枒鯸䶖᳋仢ꝯ笨쵎⠢簂蹥坛ב്ֿ墾뱜溷훊㬨泟頻䏑៩䎆그磎쓈⺗睯茌嵣м幙뜌挔\uddfa㠫擳鸝䫩ᴽ䣹ꑴ綄쩪⎽綑覟咽ﺴદ卣봊極퐗㸜樁鏨䔟ᐐ䚴ꨅ獩쒡⥷珗蘦姙׳姸뒢暗\udac9㌊敵餗倜ᩄ佺ꖧ祄킹♖竩躵啢ၲ喳멧澻헭㦪炑雡䋙ᕕ䅑끈瘺숒⿚畄臢恼ɻ弲듍愦\udfc8㙣憛鿹䮫₭䳍ꋯ缗쬍ℓ耾豈剼ｮஹ兖삠汻튲㻍歠邇䡽ᇐ䞼ꯅ熹죏⳯犗蜍嬏ࡕ尪눟枓\udb56ㆠ桻鲲乍᪊䵼ꞈ箙춺⟞篹越墻ﳘ໒坄뭵洺\ud867㰄湹靖䎠ᣰ䐂껴皌썶Ⲉ矐莭幭σ嶠룄撆\ude81㝶捀鴿䤟Ḗ䩠ꍻ網쥍⒦縊諲劙ﲖࢸ呾붞橿펻㷓榆钁䛭፷䔓ꤸ瑐옦⨠玘蕍妦ڳ婚닝撼\ud963㎝晥馗侍᧖傦ꛙ窳콁╢礼遠嘻全ཌྷ喦륈烰혏㨏溬镣䂃ᗅ䉧꿓痈솠ツ皢苖形Š总뙲戍\udfa6㕈懧ꀈ䰜὿䪘ꅾ羌챸↚羛诮凒¦ೇ劲뽑欲텴䀧汃鈢䝈ᅔ䡎갬犬요⭫炖衲寏߮宐뇧梄\udca4㊼杊鬻䵲ᱦ乁ꟽ笊초⠫糗踅坳歹൲埉밣涭ퟅ㮥淉颰䓂ᝆ䍨굅砩쑞⸶眈荝崤ё庪뛅挷\udcd4㠡掼鹱䦈ᶾ䧄꒯绮쪼⍉絼褈呰︊਍卪뷪椒퓩㹞檝鋔䔡ᐰ䖖ꨎ珓얖⧠璻蛲⫭Ս夷둓ٜ\uda3f㎤攜駫㐝ᨃ佨꒺ᥤ쾃☾秉辂◰嶺Ⴂ囕뫯༈픨㤰瀝阿㩬ᖪ䅅냿ᙅ슡⺥甚胋〤ȶ忠떻ǲ㚠拇鼽㕎⁬䰥ꉋ`쭟↷聅貯≪ｵઆ儿뿣శ퇘㾻毲醍䃦ዙ䜚꬝ᄿ졬Ⱁ牪蜌⯹ࣴ尪닋ڟ\udb7d゙桳鯅㇙ᯘ䶤ꣅᲺ컎✟筂赬⡊ﱀฅ垷뭔ඡ\ud87e㲰湋霤㪏ព䎏귏៞쎯ⷒ碶蒀⺝̩嵜롱Я\ude77㝔採鵾㢰Ấ䩉ꍦᲙ좟⎆繤要⏏﷩চ和뺯઼퍉㵱椯鑷㸔፾䖰ꥋᓹ왣⪶狘蓛⣂ץ娨돳ֆ\ud992㓬暸髈㌦ᥩ倾꙽ᨱ쿸┎秥逍⚨全໇咀륢ྋ홱㧝澰閝㦿ᛙ䋻꼛ᔂ셄〭癱舱⼏Ĥ惹똗ȕ\udea6㕡悌ꀨ㖀ΐ䯹ꆥ⃖쳶⊊缿謅ⅿ\u0014౰刋뾸ଏ퇹䀊氖鉂㽠ᅼ䞋걵ᆑ잢⯮燡袅⳶ܖ孡녻࠾\udc48㈰朐鯦ㄝ᱀仠Ꚛ᭤첗⡳箅趞➾﯅෥壃벸ໆ휬㬳洴顊㰰឴䍆굱ᡂ쒭⹏眨苟⵳Ώ嶩럅Ϫ\uddd1㢮擄麤㜣ᵍ䤭ꑅḳ쨚⍛紌觬␂ﻭਫ਼匸벓࢖펰㹴槌鎅㶶ᒢ䛻ꪠ፟앹⤋瑸處⩔ף奍뒨ؑ\udaff㊄撊颵㑣ᩡ俷ꖛ᧿킔⛰窋轤┉索ၑ噕멒࿸픛㦨瀗難㨅ᓡ䄳꾝ᙰ솅⿙疨自ヲʲ彈딺ō㘟扯鼼㗭⃾䱕ꈋẳ쬱₍聩讎≱ﾯ௪凲삋೫튗㽜欘鄛䀞቉䟧ꬑᇷ졋Ⱶ牠蜾⪌ރ屭뇇޾\udbecㆄ梬鳝㊻ᬅ", 322927811 - -681068620, Integer.reverse(-483235354) ^ 0xC70D2F26, 0xA86C3D29 ^ 0xBCFC1382);
        return dhkh_3.newFixedLengthResponse((NanoHTTPD.Response.IStatus)NanoHTTPD.Response.Status.OK, (String)dhkh_3.cqrhjxrlg("쯗ᾭ痖걥ῳ⪌彻蒅", Integer.reverse(-574697667) ^ 0x6E4E70D2, -1966172101 - -260346007, dhkh_3.ersv98io6bl(0x79346D5 ^ 0xD2F1D4D0, 11)), (String)object);
    }

    @Generated
    public String getName() {
        block0: {
            int n = -1908802890;
            n = Integer.rotateLeft(n * 925282749, 4) ^ 0x784D84E3;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x485DF6EA;
            if ((n2 ^ n) == 1214117610) break block0;
            int cfr_ignored_0 = (0xC6640C5C ^ n) + -486497450;
        }
        return this.bma;
    }

    @Generated
    public boolean isRender() {
        return this.rha_2;
    }

    private static String cqrhjxrlg(String string, int n, int n2, int n3) {
        int n4 = 739306510;
        n4 = Integer.rotateLeft(n4 * -338303419, 14) ^ 0xF900496F;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 17);
        int n5 = (n4 = n ^ n4) ^ 0x7AC68BE5;
        if ((n5 ^ n4) != 2059832293) {
            int cfr_ignored_0 = (0x56D667EB ^ n4) - 357544689;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xC618B092) + rlk ^ Integer.reverse(n2 + i * -1027058483), 25) - shdj_2);
        }
        return new String(cArray);
    }

    private static String avoj8evfw(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1040162581;
            n4 = Integer.rotateLeft(n4 * -1709482265, 6) ^ 0xB67C37CD;
            n4 = Integer.rotateRight(n ^ n4, 13);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 9)) ^ 0xABF489FD;
            if ((n5 ^ n4) == -1410037251) break block0;
            int cfr_ignored_0 = (0x960B16E8 ^ n4) - -1377370984;
        }
        return dhkh_3.cqrhjxrlg(string, n, n2, n3);
    }

    private static Path he0u6fnb74(String string, String[] stringArray) {
        block0: {
            int n = tkh.zmkh(171057616);
            n = (stringArray != null ? System.identityHashCode(stringArray) : 0) ^ n;
            int n2 = n ^ 0xC55D4405;
            if ((n2 ^ n) == -983743483) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCF6F65D5 ^ n, 12) - 584774662) * -814783019;
            int cfr_ignored_1 = (int)(0xDDDCBE827D4EB4FL ^ (long)n ^ 0x6AA0831A2DB9B66AL);
        }
        return Path.of(string, stringArray);
    }

    private static boolean mohal2b7gi(File file) {
        block0: {
            int n = 489203190;
            n = Integer.rotateLeft(n * 2095797543, 12) ^ 0x54FACF4E;
            File file2 = file;
            n = (file2 != null ? System.identityHashCode(file2) : 0) ^ n;
            int n2 = n ^ 0xF97E5163;
            if ((n2 ^ n) == -109162141) break block0;
            int cfr_ignored_0 = (0xE456F495 ^ n) - 1377734983;
        }
        return file.exists();
    }

    private static String coso9s5gcyar2fl(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1360125164;
            n4 = Integer.rotateLeft(n4 * -253287697, 16) ^ 0xA9412B2A;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 17)) ^ 0xBED00140;
            if ((n5 ^ n4) == -1093664448) break block0;
            int cfr_ignored_0 = (0x103E2254 ^ n4) - -1989715461;
        }
        return dhkh_3.cqrhjxrlg(string, n, n2, n3);
    }

    private static String qrzwv0qnv8e8m(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1342450024;
            n4 = Integer.rotateLeft(n4 * -1588580839, 13) ^ 0x65D32F37;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
            int n5 = (n4 = n ^ n4) ^ 0xC1A1C1CF;
            if ((n5 ^ n4) == -1046363697) break block0;
            int cfr_ignored_0 = (0x91A5E8A7 ^ n4) - -1898781359;
        }
        return dhkh_3.cqrhjxrlg(string, n, n2, n3);
    }

    private static int onggeefoup(String string, int n) {
        block0: {
            int n2 = tkh.zmkh(-415583945);
            String string2 = string;
            n2 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 29);
            int n3 = n2 ^ 0xDA3655BA;
            if ((n3 ^ n2) == -633973318) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x3D0CE48D ^ n2, 10) - 1760382030;
            int cfr_ignored_1 = (int)(0xFFBE4AB027D4EB4FL ^ (long)n2 ^ 0x6810831A2DB852ADL);
        }
        return string.lastIndexOf(n);
    }

    private static void q5av7r34(bhdh bhdh2, String string) {
        int n = 2020290751;
        n = Integer.rotateLeft(n * 1046133569, 20) ^ 0xE57324B0;
        bhdh bhdh3 = bhdh2;
        n = (bhdh3 != null ? System.identityHashCode(bhdh3) : 0) ^ n;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
        int n2 = n ^ 0xDAD9D9F6;
        if ((n2 ^ n) != -623257098) {
            int cfr_ignored_0 = (0xA2B2E949 ^ n) - -1408599868;
        }
        bhdh2.rzs_4(string);
    }

    private static int wzdzwg6j1f3(int n) {
        block0: {
            int n2 = 1469093616;
            n2 = Integer.rotateLeft(n2 * -1669545673, 22) ^ 0xF558968D;
            int n3 = (n2 = n ^ n2) ^ 0x4849BBAC;
            if ((n3 ^ n2) == 1212791724) break block0;
            int cfr_ignored_0 = (0x1FD92D5C ^ n2) + 1248590492;
        }
        return Integer.reverse(n);
    }

    private static String cp41aq1n8uc(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -882320932;
            n4 = Integer.rotateLeft(n4 * -794364141, 16) ^ 0x8B9A4F1D;
            n4 = Integer.rotateLeft(n ^ n4, 5);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 4)) ^ 0xE67E1133;
            if ((n5 ^ n4) == -427945677) break block0;
            int cfr_ignored_0 = (0x2D16C8EF ^ n4) + -29017114;
        }
        return dhkh_3.cqrhjxrlg(string, n, n2, n3);
    }

    private static String zlnq3tb680x15(String string, String string2) {
        block0: {
            int n = -2098180461;
            n = Integer.rotateLeft(n * 632351167, 27) ^ 0xE06EA6DD;
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x803C5220;
            if ((n2 ^ n) == -2143530464) break block0;
            int cfr_ignored_0 = (0x2CC1CB3 ^ n) - -775934051;
        }
        return string.concat(string2);
    }

    private static String qsdsb9dvst(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tkh.zmkh(1287076422);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 11);
            int n5 = (n4 = n3 ^ n4) ^ 0x7617848B;
            if ((n5 ^ n4) == 1981252747) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x3AA0BECD ^ n4, 10) - 500480526;
            int cfr_ignored_1 = (int)(0xF81210F027D4EB4FL ^ (long)n4 ^ 0xDC90831A2DB85DF5L);
        }
        return dhkh_3.cqrhjxrlg(string, n, n2, n3);
    }

    private static NanoHTTPD.Response ocnpbkhj1(String string) {
        block0: {
            int n = -848385266;
            n = Integer.rotateLeft(n * 481148697, 6) ^ 0x3820A668;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 10);
            int n2 = n ^ 0xDEB6FA78;
            if ((n2 ^ n) == -558433672) break block0;
            int cfr_ignored_0 = (0x13D85176 ^ n) - -849114912;
        }
        return dhkh_3.newFixedLengthResponse((String)string);
    }

    private static int ersv98io6bl(int n, int n2) {
        block0: {
            int n3 = -1155725935;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1000433759, 23) ^ 0xCA74ED21) ^ 0x53FD6568;
            if ((n4 ^ n3) == 1409115496) break block0;
            int cfr_ignored_0 = (0xE8E060F9 ^ n3) + -888675693;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] qgkdojjt5cejw(String string) {
        int n = -1777570033;
        int n2 = (n = Integer.rotateLeft(n * 424615109, 25) ^ 0x6FDFB0B0) ^ 0x48A0ECDA;
        if ((n2 ^ n) != 1218505946) {
            int cfr_ignored_0 = (0xDEAC83D5 ^ n) - 1518037705;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite i3wk889ubc6lrw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 912695375;
            n3 = Integer.rotateLeft(n3 * 328158635, 17) ^ 0x72680608;
            n3 = n ^ n3;
            n3 = Integer.rotateRight(n2 ^ n3, 20);
            int n4 = n3 ^ 0x87361D63;
            if ((n4 ^ n3) != -2026496669) {
                int cfr_ignored_0 = (0xB150BD2C ^ n3) + 745730073;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rdb ^ string.hashCode() ^ n2 + sal ^ i * -1235169147 ^ rdb, 20) ^ sal));
            }
            String[] stringArray = dhkh_3.qgkdojjt5cejw(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] gh0b9ctgb9(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite r8e4ymt1d3l5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rnninu53cdbjp ^ string.hashCode() ^ n2 + ehfx8djd ^ i * 907624423 ^ rnninu53cdbjp, 20) ^ ehfx8djd));
            }
            String[] stringArray = dhkh_3.gh0b9ctgb9(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

