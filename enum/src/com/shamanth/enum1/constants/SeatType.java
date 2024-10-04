package com.shamanth.enum1.constants;

public enum SeatType {
    RECLINER(1),
    PREMIUM(2),
    EXECUTIVE(3);

    private final int seatNo;

    SeatType(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }
}

