package com.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.EmptyStackException;

public class StackShould {

    private static final Object OBJECT1 = "Some Object";
    private static final Object OBJECT2 = "Another Object";
    private Stack stack;

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

        assertThat(stack.pop(), is(OBJECT2));
    }

    @Test
    public void pop_objects_in_reverse_order_they_were_pushed() {
        stack.push(OBJECT1);
        stack.push(OBJECT2);

        assertThat(stack.pop(), is(OBJECT2));
        assertThat(stack.pop(), is(OBJECT1));
    }
}
