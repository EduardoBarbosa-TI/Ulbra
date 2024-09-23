interface Reservation {
    getData(): Date;
    getRoom(): number;
    getRevenue(): number;
}

class SimpleReservation implements Reservation {
    getData(): Date {
        return new Date("2024-07-08");
    }

    getRoom(): number {
        return 3;
    }

    getRevenue(): number {
        return 3000;
    }
}

class SegmentReservation implements Reservation {
    getData(): Date {
        return new Date("2024-07-08");
    }

    getRoom(): number {
        return 25;
    }

    getRevenue(): number {
        return 20000;
    }

    getSegment(): string{
        return "Reserva Grupo Latam";
    }
}