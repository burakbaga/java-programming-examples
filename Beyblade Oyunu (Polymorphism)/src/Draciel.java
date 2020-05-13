/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class Draciel extends Beyblade {
    
    private String kutsalCanavar;
    
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
    
     @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal canavar: "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ortaya çıkarıyor..");
        System.out.println(getBeybladeci()+" ın saldırısı : Kale Savunması");
        
    }
    
}
