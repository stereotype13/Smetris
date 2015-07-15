import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import com.smetris.*;

public class BlockTest {
	
	@Test
	public void TShapeInitialBlockPositionsTest() {
		IShape tShape = new TShape(1, true);

		//Block 1 x-value should be 1
		assertThat(tShape.getBlocks().get(0).getRX(), equalTo(1));

		//Block 1 y-value should be 0
		assertThat(tShape.getBlocks().get(0).getRY(), equalTo(0));

		//Block 2 x-value should be 0
		assertThat(tShape.getBlocks().get(1).getRX(), equalTo(0));

		//Block 2 y-value should be 1
		assertThat(tShape.getBlocks().get(1).getRY(), equalTo(1));

		//Block 3 x-value should be 1
		assertThat(tShape.getBlocks().get(2).getRX(), equalTo(1));

		//Block 3 y-value should be 1
		assertThat(tShape.getBlocks().get(2).getRY(), equalTo(1));

		//Block 4 x-value should be 2
		assertThat(tShape.getBlocks().get(3).getRX(), equalTo(2));

		//Block 4 y-value should be 1
		assertThat(tShape.getBlocks().get(3).getRY(), equalTo(1));
	}

	@Test
	public void TShapeTranslateDownBlockPositionsTest() {
		IShape tShape = new TShape(1, true);

		tShape.translate(Block.Direction.DOWN, 1);

		//Block 1 x-value should be 1
		assertThat(tShape.getBlocks().get(0).getRX(), equalTo(1));

		//Block 1 y-value should be 1
		assertThat(tShape.getBlocks().get(0).getRY(), equalTo(1));

		//Block 2 x-value should be 0
		assertThat(tShape.getBlocks().get(1).getRX(), equalTo(0));

		//Block 2 y-value should be 2
		assertThat(tShape.getBlocks().get(1).getRY(), equalTo(2));

		//Block 3 x-value should be 1
		assertThat(tShape.getBlocks().get(2).getRX(), equalTo(1));

		//Block 3 y-value should be 2
		assertThat(tShape.getBlocks().get(2).getRY(), equalTo(2));

		//Block 4 x-value should be 2
		assertThat(tShape.getBlocks().get(3).getRX(), equalTo(2));

		//Block 4 y-value should be 2
		assertThat(tShape.getBlocks().get(3).getRY(), equalTo(2));
	}

	@Test
	public void TShapeTranslateDownLeftBlockPositionsTest() {
		IShape tShape = new TShape(1, true);

		tShape.translate(Block.Direction.DOWN, 1);
		tShape.translate(Block.Direction.LEFT, 1);

		//Block 1 x-value should be 0
		assertThat(tShape.getBlocks().get(0).getRX(), equalTo(0));

		//Block 1 y-value should be 1
		assertThat(tShape.getBlocks().get(0).getRY(), equalTo(1));

		//Block 2 x-value should be -1
		assertThat(tShape.getBlocks().get(1).getRX(), equalTo(-1));

		//Block 2 y-value should be 2
		assertThat(tShape.getBlocks().get(1).getRY(), equalTo(2));

		//Block 3 x-value should be 0
		assertThat(tShape.getBlocks().get(2).getRX(), equalTo(0));

		//Block 3 y-value should be 2
		assertThat(tShape.getBlocks().get(2).getRY(), equalTo(2));

		//Block 4 x-value should be 1
		assertThat(tShape.getBlocks().get(3).getRX(), equalTo(1));

		//Block 4 y-value should be 2
		assertThat(tShape.getBlocks().get(3).getRY(), equalTo(2));
	}
}