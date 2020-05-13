
public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public Account() {

        this("Bilgi yok", 0.0, "yok", "yok", "yok");

    }

    public Account(String isim, String email, String telefonNo) {

        this("Bilgi Yok", 0.0, isim, email, telefonNo);

    }

    public Account(String hesapNo, double bakiye, String isim, String Email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = Email;
        this.telefonNo = telefonNo;

    }

    public void bilgileriGoster() {
        System.out.println("Hesap No: " + this.hesapNo);
        System.out.println("bakiye: " + this.bakiye);
        System.out.println("isim: " + this.isim);
        System.out.println("email: " + this.email);
        System.out.println("tel no :  " + this.telefonNo);

    }

    public void paraYatir(double miktar) {
        bakiye += miktar;

        System.out.println("Yeni bakiye : " + bakiye);
    }

    public void paraCekme(double miktar) {

        if (miktar > 1500) {
            System.out.println("1500 tlden fazla çekemezsiniz");
        }
        if (bakiye - miktar < 0) {
            System.out.println("yeterli bakiye yok" + bakiye);

        } else {
            bakiye -= miktar;
            System.out.println("bakiye :" + bakiye);
        }

    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

}
