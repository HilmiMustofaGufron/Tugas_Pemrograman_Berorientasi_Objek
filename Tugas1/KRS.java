/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Huawei
 */
public class KRS {
    public static void main(String[] args) {
        MasterHari mh = new MasterHari();
        MasterMatkul mk = new MasterMatkul();
        MasterDosenPengampu dp = new MasterDosenPengampu();
        MasterKelas mkls = new MasterKelas();
        Biodata b = new Biodata();
        SKS s = new SKS();

        System.out.println("BIODATA MAHASISWA");
        System.out.println("NAMA        : "+b.Nama);
        System.out.println("NIM         : "+b.NIM);
        System.out.println("PRODI       : "+b.Prodi);
        System.out.println("DOSEN WALI  : "+b.Dosenwali);
        System.out.println("\n");
        System.out.println("JADWAL PERKULIAHAN");
        System.out.println("=========================================================================================================================");
        System.out.println("|HARI" + "\t\t|" + "MATA KULIAH" + "\t\t\t\t|" + "DOSEN PENGAMPU" +"\t\t\t\t\t|"+"SKS"+ "\t|" + "KELAS" + "\t|");
        System.out.println("=========================================================================================================================");
        System.out.println("|" + mh.H1 + "\t\t|" + mk.mk1 + "\t\t\t|" + dp.DP1 + "\t\t\t\t|" +s.sks1+"\t|"+ mkls.mkls1 + "\t|");
        System.out.println("|\t\t|" + mk.mk2 + "\t\t|" + dp.DP2 + "\t\t|" +s.sks2+"\t|"+ mkls.mkls2 + "\t|");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|" + mh.H2 + "\t\t|" + mk.mk3 + "\t\t\t|" + dp.DP3 + "\t\t|" +s.sks3+"\t|"+ mkls.mkls3 + "\t|");
        System.out.println("|\t\t|" + mk.mk4 + "\t|" + dp.DP4 + "\t\t\t|" +s.sks4+"\t|"+ mkls.mkls4 + "\t|");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|" + mh.H3 + "\t\t|" + mk.mk5 + "\t\t\t|" + dp.DP5 + "\t\t|" +s.sks5+"\t|"+ mkls.mkls5 + "\t|");
        System.out.println("|\t\t|" + mk.mk6 + "\t\t\t|" + dp.DP6 + "\t\t|" +s.sks6+"\t|"+ mkls.mkls6 + "\t|");
        System.out.println("|\t\t|" + mk.mk7 + "\t\t|" + dp.DP7 + "\t\t|" +s.sks7+"\t|"+ mkls.mkls7 + "\t|");
        System.out.println("=========================================================================================================================");

    }
}
