import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
  
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        for (int i = 0; i < 30; i++) {
            Wall wall = new Wall();
            addObject(wall, 48 * i, 22);

        }
        for (int i = 0; i < 20; i++) {
            Wall wall = new Wall();
            addObject(wall, 24, 43 * i);

        }
        for (int i = 0; i < 20; i++) {
            Wall wall = new Wall();
            addObject(wall, 1176, 43 * i);

        }
        for (int i = 0; i < 30; i++) {
            Wall wall = new Wall();
            addObject(wall, 48 * i, 778);

        }

        Wall wall101 = new Wall();
        addObject(wall101,286,65);
        Wall wall102 = new Wall();
        addObject(wall102,283,110);
        Wall wall103 = new Wall();
        addObject(wall103,278,154);
        Wall wall104 = new Wall();
        addObject(wall104,277,198);
        Wall wall105 = new Wall();
        addObject(wall105,274,243);
        Wall wall106 = new Wall();
        addObject(wall106,275,286);
        Wall wall107 = new Wall();
        addObject(wall107,319,288);
        Wall wall108 = new Wall();
        addObject(wall108,363,287);
        Wall wall109 = new Wall();
        addObject(wall109,404,285);
        Wall wall110 = new Wall();
        addObject(wall110,452,287);
        Wall wall111 = new Wall();
        addObject(wall111,309,246);
        Wall wall112 = new Wall();
        addObject(wall112,323,64);
        Wall wall113 = new Wall();
        addObject(wall113,326,106);
        Wall wall114 = new Wall();
        addObject(wall114,371,58);
        Wall wall115 = new Wall();
        addObject(wall115,435,64);
        Wall wall116 = new Wall();
        addObject(wall116,233,63);
        Wall wall117 = new Wall();
        addObject(wall117,231,114);
        Wall wall118 = new Wall();
        addObject(wall118,234,164);
        Wall wall119 = new Wall();
        addObject(wall119,74,71);
        Wall wall120 = new Wall();
        addObject(wall120,331,325);
        Wall wall121 = new Wall();
        addObject(wall121,383,330);
        Wall wall122 = new Wall();
        addObject(wall122,73,735);
        Wall wall123 = new Wall();
        addObject(wall123,74,679);
        Wall wall124 = new Wall();
        addObject(wall124,73,646);
        wall123.setLocation(76,695);
        Wall wall125 = new Wall();
        addObject(wall125,73,598);
        Wall wall126 = new Wall();
        addObject(wall126,119,734);
        Wall wall127 = new Wall();
        addObject(wall127,168,734);
        Wall wall128 = new Wall();
        addObject(wall128,121,690);
        Wall wall129 = new Wall();
        addObject(wall129,71,466);
        Wall wall130 = new Wall();
        addObject(wall130,134,463);
        wall130.setLocation(120,467);
        Wall wall131 = new Wall();
        addObject(wall131,71,419);
        Wall wall132 = new Wall();
        addObject(wall132,170,458);
        Wall wall133 = new Wall();
        addObject(wall133,72,508);
        Wall wall134 = new Wall();
        addObject(wall134,125,500);
        Wall wall135 = new Wall();
        addObject(wall135,85,544);
        wall135.setLocation(76,556);
        Wall wall136 = new Wall();
        addObject(wall136,218,734);
        Wall wall137 = new Wall();
        addObject(wall137,270,739);
        Wall wall138 = new Wall();
        addObject(wall138,533,418);

        Wall wall139 = new Wall();
        addObject(wall139,583,419);
        Wall wall140 = new Wall();
        addObject(wall140,632,419);
        Wall wall141 = new Wall();
        addObject(wall141,681,421);
        Wall wall142 = new Wall();
        addObject(wall142,637,460);
        Wall wall143 = new Wall();
        addObject(wall143,582,459);

        Wall wall144 = new Wall();
        addObject(wall144,584,378);
        Wall wall145 = new Wall();
        addObject(wall145,631,379);

        Wall wall146 = new Wall();
        addObject(wall146,732,418);
        Wall wall147 = new Wall();
        addObject(wall147,791,419);
        Wall wall148 = new Wall();
        addObject(wall148,685,460);

        Wall wall149 = new Wall();
        addObject(wall149,683,384);
        Wall wall150 = new Wall();
        addObject(wall150,634,337);
        Wall wall151 = new Wall();
        addObject(wall151,634,288);
        Wall wall152 = new Wall();
        addObject(wall152,636,238);
        Wall wall153 = new Wall();
        addObject(wall153,676,334);
        Wall wall154 = new Wall();
        addObject(wall154,729,376);
        Wall wall155 = new Wall();
        addObject(wall155,631,495);
        Wall wall156 = new Wall();
        addObject(wall156,595,326);
        Wall wall157 = new Wall();
        addObject(wall157,725,335);
        Wall wall158 = new Wall();
        addObject(wall158,785,381);
        Wall wall159 = new Wall();
        addObject(wall159,842,415);
        Wall wall160 = new Wall();
        addObject(wall160,484,736);
        Wall wall161 = new Wall();
        addObject(wall161,479,690);
        Wall wall162 = new Wall();
        addObject(wall162,488,647);
        Wall wall163 = new Wall();
        addObject(wall163,529,723);
        Wall wall164 = new Wall();
        addObject(wall164,402,537);
        Wall wall165 = new Wall();
        addObject(wall165,355,536);
        Wall wall166 = new Wall();
        addObject(wall166,302,541);
        Wall wall167 = new Wall();
        addObject(wall167,357,493);
        Wall wall168 = new Wall();
        addObject(wall168,465,535);
        Wall wall169 = new Wall();
        addObject(wall169,398,499);
        Wall wall170 = new Wall();
        addObject(wall170,355,577);
        wall168.setLocation(437,542);
        Wall wall171 = new Wall();
        addObject(wall171,817,66);
        Wall wall172 = new Wall();
        addObject(wall172,865,66);
        Wall wall173 = new Wall();
        addObject(wall173,920,64);
        Wall wall174 = new Wall();
        addObject(wall174,867,106);
        Wall wall175 = new Wall();
        addObject(wall175,862,161);
        Wall wall176 = new Wall();
        addObject(wall176,858,205);
        Wall wall177 = new Wall();
        addObject(wall177,817,115);
        Wall wall178 = new Wall();
        addObject(wall178,767,66);
        Wall wall179 = new Wall();
        addObject(wall179,1131,298);
        Wall wall180 = new Wall();
        addObject(wall180,1071,300);
        Wall wall181 = new Wall();
        addObject(wall181,1020,303);
        Wall wall182 = new Wall();
        addObject(wall182,1079,346);
        Wall wall183 = new Wall();
        addObject(wall183,1064,259);
        Wall wall184 = new Wall();
        addObject(wall184,1117,256);
        Wall wall185 = new Wall();
        addObject(wall185,1122,207);
        Wall wall186 = new Wall();
        addObject(wall186,1123,730);
        Wall wall187 = new Wall();
        addObject(wall187,1052,732);
        Wall wall188 = new Wall();
        addObject(wall188,1001,732);
        Wall wall189 = new Wall();
        addObject(wall189,945,732);
        Wall wall190 = new Wall();
        addObject(wall190,1122,687);
        Wall wall191 = new Wall();
        addObject(wall191,1123,646);
        Wall wall192 = new Wall();
        addObject(wall192,1118,597);
        Wall wall193 = new Wall();
        addObject(wall193,1068,686);
        Wall wall194 = new Wall();
        addObject(wall194,1012,689);
        wall187.setLocation(1068,732);
        wall188.setLocation(1025,731);
        Wall wall195 = new Wall();
        addObject(wall195,1123,546);
        Wall wall196 = new Wall();
        addObject(wall196,894,732);
        wall189.setLocation(960,735);
        wall196.setLocation(906,731);
        Wall wall197 = new Wall();
        addObject(wall197,862,730);
        Wall wall198 = new Wall();
        addObject(wall198,850,464);
        Wall wall199 = new Wall();
        addObject(wall199,847,511);
        Wall wall200 = new Wall();
        addObject(wall200,897,507);
        Wall wall201 = new Wall();
        addObject(wall201,795,460);
        Wall wall202 = new Wall();
        addObject(wall202,844,366);
        Wall wall203 = new Wall();
        addObject(wall203,772,341);
        Wall wall204 = new Wall();
        addObject(wall204,677,292);
        Wall wall205 = new Wall();
        addObject(wall205,740,287);
        wall205.setLocation(731,296);
        Medium medium = new Medium();
        GameStart gameStart = new GameStart();
        addObject(gameStart,520,363);

        Hard hard = new Hard();
        addObject(hard,710,412);
        Easy easy = new Easy();
        addObject(easy,460,411);
        addObject(medium,587,414);

        gameStart.setLocation(924,417);

        gameStart.setLocation(600,400);

        hard.setLocation(683,384);
        wall149.setLocation(677,384);
        wall149.setLocation(830,603);
        hard.setLocation(696,401);
        wall149.setLocation(693,367);
        wall141.setLocation(755,476);
        hard.setLocation(710,411);
        wall146.setLocation(714,406);
        hard.setLocation(710,413);
        wall141.setLocation(663,407);
        wall167.setLocation(366,485);
        removeObject(wall167);
        removeObject(wall169);
        removeObject(wall168);
        removeObject(wall165);
        removeObject(wall164);
        removeObject(wall170);
        removeObject(wall166);
        removeObject(wall132);
        removeObject(wall134);
        removeObject(wall131);
        removeObject(wall130);
        removeObject(wall156);
        removeObject(wall144);
        removeObject(wall138);
        wall142.setLocation(625,487);
        removeObject(wall155);
        removeObject(wall143);
        removeObject(wall152);
        removeObject(wall205);
        removeObject(wall203);
        removeObject(wall204);
        removeObject(wall202);
        removeObject(wall200);
        removeObject(wall199);
        removeObject(wall198);
        wall146.setLocation(750,424);
        wall140.setLocation(660,411);
        wall141.setLocation(679,410);
        wall149.setLocation(670,369);
        wall140.setLocation(616,426);
        wall142.setLocation(630,458);

        MediumText mediumText = new MediumText();
        addObject(mediumText,588,455);

        EasyText easyText = new EasyText();
        addObject(easyText,459,463);
        wall148.setLocation(708,460);
        HardText hardText = new HardText();
        addObject(hardText,712,460);

        
        SlctDifficulty slctDifficulty = new SlctDifficulty();
        addObject(slctDifficulty,590,302);
    }
}
