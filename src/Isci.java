public class Isci {
    private String adSoyad;
     double maas;
     int workHours;
     int baslamYili;
     public Isci(String adSoyad, double maas, int calismaSaatleri, int baslamaYili ) {

        this.adSoyad = adSoyad;
        this.maas = maas;
        this.workHours = calismaSaatleri;
        this.baslamYili = baslamaYili;

    }


    public double tax() {

        int tax = 0;
        if (maas > 1500) {
            tax = (int) (maas * 0.03);
        }
        return tax;
    }

    public int bonus() {

        int bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }


    public double raiseSalary() {

        int calismaYilToplam = (2021 - baslamYili);
        double maasArtis = 0;
        double lastSalary = 0;
        lastSalary = maas + bonus() - tax();
        if (calismaYilToplam < 10) {
            maasArtis = lastSalary * 0.05;
        } else if (calismaYilToplam < 20) {
            maasArtis = (lastSalary* 0.10);
        } else
            maasArtis = (lastSalary * 0.15);
        return maasArtis;
    }
    public String toString() {
        return
                        "\nAd Soyad    : " + adSoyad +
                        "\nMaaş             : " + maas +
                        "\nHaftalık çalışma saati           : " + workHours +
                        "\nİşe başlama            : " + baslamYili +
                        "\nVergi               : " + tax() +
                        "\nBonus               :" + bonus() +
                        "\nMaaşta artış         : " + raiseSalary() +
                        "\nNet Maaş            : " + (maas - tax() + bonus() + raiseSalary());
    }
}

