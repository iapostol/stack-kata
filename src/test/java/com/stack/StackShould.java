package com.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

public class StackShould {

    Object OBJECT1 = "Some Object";
    Object OBJECT2 = "Another Object";
    Stack stack;

    @Before
    public void Setup(){
        stack = new Stack();
    }

    @Test(expected = EmptyStackException.class)
    public void throw_exception_if_pop_when_is_empty() {
        stack.pop();
    }

    @Test
    public void pop_last_pushed_object() {
        stack.push(OBJECT1);
        stack.push(OBJECT2);

        assertEquals(OBJECT2, stack.pop());
    }

    @Test
    public void pop_objects_in_reverse_order_they_were_pushed() {
        stack.push(OBJECT1);
        stack.push(OBJECT2);
        stack.pop();

        assertEquals(OBJECT1, stack.pop());
    }

}
