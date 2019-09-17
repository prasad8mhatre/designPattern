package com.statemachine;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeadStateTest {

    @Test
    public void testStateTransition() {
        LeadState leadState = LeadState.NEW_LEADS;

        leadState = leadState.process();

        assertEquals(LeadState.CONTACTED_LEADS,leadState);

        leadState = leadState.process();

        assertEquals(LeadState.QUALIFIED_LEADS,leadState);

        leadState = leadState.process();

        assertEquals(LeadState.PROPOSALS_SENT,leadState);

        leadState = leadState.process();

        assertEquals(LeadState.OPPORTUNITIES,leadState);

        leadState = leadState.process();

        assertEquals(LeadState.CLOSED_DEALS,leadState);

        leadState = leadState.process();

        assertEquals(LeadState.CONVERTED,leadState);

        leadState = leadState.process();

        assertEquals(LeadState.CONVERTED,leadState);

        leadState = leadState.prevState();

        assertEquals(LeadState.CLOSED_DEALS,leadState);



    }
}