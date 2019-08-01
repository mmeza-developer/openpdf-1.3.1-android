package com.lowagie.text.pdf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GlyphListTest {

  @Test
  void shouldContainGlyphList() {

    // test some of the unicode codes in the glyph list
    int[] glyphs = new int[]{65, 198, 508, 482, 63462, 193, 63457, 258, 7854, 1232, 7862, 7856, 7858, 7860, 461, 9398, 194, 7844, 7852,
        7846, 7848, 63458, 7850, 63177, 63412, 1040, 512, 196, 1234, 478, 63460, 7840, 480, 192, 63456, 7842, 1236, 514, 913, 902, 256,
        65313, 260, 197, 506, 7680, 63461, 63329, 195, 63459, 1329, 66, 9399, 7682, 7684, 1041, 1330, 914, 385, 7686, 65314, 63220, 63330,
        386, 67, 1342, 262, 63178, 63221, 268, 199, 7688, 63463, 9400, 264, 266, 266, 63416, 1353, 1212, 1063, 1214, 1206, 1268, 1347, 1227,
        1208, 935, 391, 63222, 65315, 1361, 63331, 68, 497, 452, 1332, 393, 270, 7696, 9401, 7698, 272, 7690, 7692, 1044, 1006, 8710, 916,
        394, 63179, 63180, 63181, 63400, 988, 1026, 7694, 65316, 63223, 272, 63332, 395, 498, 453, 1248, 1029, 1039, 69, 201, 63465, 276,
        282, 7708, 1333, 9402, 202, 7870, 7704, 7878, 7872, 7874, 63466, 7876, 1028, 516, 203, 63467, 278, 278, 7864, 1060, 200, 63464,
        1335, 7866, 8551, 518, 1124, 1051, 8554, 274, 7702, 7700, 1052};
    for (int glyph : glyphs) {
      assertEquals(glyph, GlyphList.nameToUnicode(GlyphList.unicodeToName(glyph))[0]);
    }

  }
}
