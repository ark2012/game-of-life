package com.wakaleo.gameoflife.domain;

import static com.wakaleo.gameoflife.domain.Cell.DEAD_CELL;
import static com.wakaleo.gameoflife.domain.Cell.LIVE_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class WhenYouCreateACell {

    @Test
    public void aLiveCellShouldBeRepresentedByAnAsterisk() {
        Cell cell = Cell.fromSymbol(Cell.LIVE_CELL.toString());
        assertThat(cell, is(LIVE_CELL));
    }

    @Test
    public void aDeadCellShouldBeRepresentedByADot() {
        Cell cell = Cell.fromSymbol(Cell.DEAD_CELL.toString());
        assertThat(cell, is(DEAD_CELL));
    }


}
