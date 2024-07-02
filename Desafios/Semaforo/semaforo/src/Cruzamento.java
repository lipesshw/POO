import java.util.ArrayList;
import java.util.List;

public class Cruzamento {
    private List<Semaforo> semaforos;

    public Cruzamento() {
        this.semaforos = new ArrayList<>();
    }

    public void adicionaSemaforo(Semaforo semaforo) {
        this.semaforos.add(semaforo);
    }

    public void sincroniza() {
        if (semaforos.size() == 2) {
            Semaforo semaforo1 = semaforos.get(0);
            Semaforo semaforo2 = semaforos.get(1);
            if (semaforo1.estaAberto()) {
                semaforo1.fecha();
                semaforo2.abre();
            } else {
                semaforo1.abre();
                semaforo2.fecha();
            }
        }
    }

    public int totalDeSemaforos() {
        return this.semaforos.size();
    }
}
