package Mocking;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class CcalculateMockTest {

	@Test
	public void testAdd() {

	}

	@Test
	public void testFromMockSite() {
		List mockList = mock(List.class);
		mockList.add("one");
		mockList.add("two");

		when(mockList.get(0)).thenReturn("four").thenReturn("five");

		if (mockList == null) {
			System.out.println("mockList is null");
		} else {
			System.out.println("mockList id not null");

			System.out.println(mockList.size());
			System.out.println(mockList.get(0));
			System.out.println(mockList.get(0));
			System.out.println(mockList.get(0));
			System.out.println(mockList.get(0));
		}

		// IF we remove .themThrow then the get method will return String six on
		// any index
		when(mockList.get(anyInt()))
		// .thenThrow(new NullPointerException())
				.thenReturn("six");

		try {
			System.out.println(mockList.get(1));
			System.out.println(mockList.get(9999));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Verify that mockList object has add String one object
		verify(mockList).add("one");
	}
}
