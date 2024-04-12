public class Mahasiswaku<T, U, V> {
    private T nim;
    private U nama;
    private V kelas;

    public T getNim() {
        return nim;
    }

    public void setNim(T nim) {
        this.nim = nim;
    }

    public U getNama() {
        return nama;
    }

    public void setNama(U nama) {
        this.nama = nama;
    }

    public V getKelas() {
        return kelas;
    }

    public void setKelas(V kelas) {
        this.kelas = kelas;
    }

    public static void main(String[] args) {
        Mahasiswaku<String, String, Integer> m = new Mahasiswaku<>();
        m.setNim("20220040092");
        m.setNama("Yayang Rega Abdilah");
        m.setKelas(22);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getKelas());
    }
}