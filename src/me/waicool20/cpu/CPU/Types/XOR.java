package me.waicool20.cpu.CPU.Types;

import me.waicool20.cpu.CPU.CPU;
import org.bukkit.inventory.ItemStack;

public class XOR extends Type {

    public XOR(CPU cpu) {
        CPU_MODULE = cpu;
        setName("XOR");
    }

    @Override
    public ItemStack[] typeInventory() {
        ItemStack[] typeInventory = {null, null, null, null, GOLD, null, null, null, null,
                redW, redR, redT, redT, redW, redT, redT, redR, redW,
                redW, IRON, null, null, null, null, null, IRON, redW,};
        return typeInventory;
    }

    @Override
    public void updatePower() {
        if (CPU_MODULE.getInput1().isPowered() ^ CPU_MODULE.getInput2().isPowered()) {
            if (CPU_MODULE.getOutput().getPower()) {
                return;
            }
            CPU_MODULE.getOutput().setPower(true, CPU_MODULE.getDelay());
        } else {
            if (!CPU_MODULE.getOutput().getPower()) {
                return;
            }
            CPU_MODULE.getOutput().setPower(false, 0);
        }
    }

    @Override
    public void disable() {
        CPU_MODULE.getOutput().setPower(false, 0);
    }
}
