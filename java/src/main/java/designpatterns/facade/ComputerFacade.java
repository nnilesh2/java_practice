package designpatterns.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;
    /**
     * @param cpu
     * @param memory
     * @param hardDisk
     */
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDisk = new HardDisk();
    }

    public void start(){
        cpu.start();
        memory.load();
        hardDisk.read();
    }
    
}
