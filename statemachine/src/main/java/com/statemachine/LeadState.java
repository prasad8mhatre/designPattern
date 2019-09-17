package com.statemachine;

public enum LeadState {
    NEW_LEADS {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return CONTACTED_LEADS;
        }

        public LeadState prevState() {
            return null;
        }
    },
    CONTACTED_LEADS {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return QUALIFIED_LEADS;
        }

        public LeadState prevState() {
            return NEW_LEADS;
        }
    },
    QUALIFIED_LEADS {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return PROPOSALS_SENT;
        }

        public LeadState prevState() {
            return CONTACTED_LEADS;
        }
    },
    PROPOSALS_SENT {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return OPPORTUNITIES;
        }

        public LeadState prevState() {
            return QUALIFIED_LEADS;
        }
    },
    OPPORTUNITIES {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return CLOSED_DEALS;
        }

        public LeadState prevState() {
            return PROPOSALS_SENT;
        }
    },
    CLOSED_DEALS {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return CONVERTED;
        }

        public LeadState prevState() {
            return OPPORTUNITIES;
        }
    },
    CONVERTED {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return this;
        }

        public LeadState prevState() {
            return CLOSED_DEALS;
        }
    },
    ON_HOLD {
        @Override
        public LeadState process() {
            return nextState();
        }

        public LeadState nextState() {
            return NEW_LEADS;
        }

        public LeadState prevState() {
            return null;
        }
    };

    public abstract LeadState process();
    public abstract LeadState nextState();
    public abstract LeadState prevState();
}
