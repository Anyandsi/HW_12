public class AListTest {

    AList list;

    @Before
    public void setUp() {
        list = new AList();
    }


    @Test
    public void shouldAddNewFirstElementAndReturnFive(){
        //given
        int expected = 5;
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        list.addFirstElement(5);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 5", expected, actual);
    }

    @Test
    public void shouldAddNewFirstElementAndReturnOne(){
        //given
        int expected = 1;
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        list.addFirstElement(5);
        int actual = list.get(1);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldAddNewFirstElementToFullArrayAndReturnEleven(){
        //given
        int expected = 11;
        for(int i = 0; i < 11; i++) {
            list.add(i);
        }

        //when
        list.addFirstElement(11);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }


    @Test
    public void shouldRemoveFirstElementAndReturnTwo(){
        //given
        int expected = 2;
        list.add(1);
        list.add(2);
        list.add(3);

        //when
        list.removeFirstElement();
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }
    @Test
    public void shouldAddFiveToThirdPositionAndReturnFive(){
        //given
        int expected = 5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);

        //when
        list.addNewElementToList(3,5);
        int actual = list.get(3);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 5", expected, actual);
    }

    @Test
    public void shouldGetIndexOfElementAndReturnTwo(){
        //given
        int expected = 2;
        list.add(1);
        list.add(2);
        list.add(3);
        //when
        int actual = list.indexOf(3);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldGetIndexOfElementAndReturnThree(){
        //given
        int expected = 3;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //when
        int actual = list.indexOf(4);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 3", expected, actual);
    }

    @Test
    public void shouldCheckForANonExistentElementInTheArrayAndReturnMinusOne(){
        //given
        int expected = -1;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //when
        int actual = list.indexOf(42);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is -1", expected, actual);
    }

    @Test
    public void shouldSeparateListElementsWithComaAndReturnSeparatedList(){
        //given
        String expected = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, ";
        for(int i = 0; i < 11; i++) {
            list.add(i);
        }

        //when
        String actual = list.separate(",");

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, ", expected, actual);


    }

    @Test
    public void shouldCheckThatArraysElementsSwapedAndReturnTwo(){
        //given
        int expected = 2;
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);

        //when
        list.sortAscending();
        int actual = list.get(1);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);


    }

}




