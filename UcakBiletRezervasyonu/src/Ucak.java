import java.util.Random;

public class Ucak {
    private String model;
    private int seriNo;
    private int kapasite;
    private int motor; 
    private double fiyat;

    public int getKapasite() {
        return kapasite; 
    }
    public Ucak(String model, int seriNo, int kapasite, int motor )
      this.model = model; 
      this.seriNo = seriNo;
      this.kapasite = kapasite; 
      this.motor = motor; 
      this.fiyat = new Random().nextInt(5000 - 1000) + 1000;
    public Ucak(String model2, int seriNo2, int kapasite2, String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString(){
        return "Uçak Modeli =" + model
               "SeriNo =" + seriNo
               "Motor =" + motor
               "Fiyat =" + fiyat + "\n"

    }
}


    

