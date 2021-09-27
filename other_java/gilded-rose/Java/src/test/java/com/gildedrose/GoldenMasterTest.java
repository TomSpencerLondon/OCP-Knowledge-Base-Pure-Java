package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

public class GoldenMasterTest {

    @Test
    void gilded_rose_should() {
        Item[] items = new Item[]{
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Normal Item", -1, 2), //
            new Item("Aged Brie", 2, 0), //
            new Item("Aged Brie", -1, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47),
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 47),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);
        IntStream.range(0, 50)
            .forEach((int i) -> app.updateQuality());

        Approvals.verifyAll("", items);
    }
}
