package Mocking;

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

		verify(mockList).add("one");
	}
}
