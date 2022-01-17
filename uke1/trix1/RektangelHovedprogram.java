// 01.08: Rektangel

class RektangelHovedprogram {
    public static void main(String[] args) {
        Rektangel en = new Rektangel(5,9);
        Rektangel to = new Rektangel(10,2);

        System.out.println("Areal av en: " + en.areal());
        System.out.println("Areal av to: " + to.areal());

        en.oekLengde(4);
        to.oekBredde(7);

        System.out.println("Omkrets av en: " + en.omkrets());
        System.out.println("Omkrets av to: " + to.omkrets());

        en.reduserLengde(7);
        to.reduserBredde(2);
        
        System.out.println("Ny areal av en: " + en.areal());
        System.out.println("Ny areal av to: " + to.areal());
    }
}