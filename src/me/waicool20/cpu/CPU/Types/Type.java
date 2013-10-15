package me.waicool20.cpu.CPU.Types;

import me.waicool20.cpu.CPU.CPU;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public abstract class Type {
    final static ItemStack redW = new ItemStack(Material.REDSTONE, 1);
    final static ItemStack redT = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
    final static ItemStack redR = new ItemStack(Material.DIODE, 1);
    final static ItemStack GOLD = new ItemStack(Material.GOLD_INGOT, 1);
    final static ItemStack IRON = new ItemStack(Material.IRON_INGOT, 1);
    final static ItemStack NPIS = new ItemStack(Material.PISTON_BASE, 1);
    final static ItemStack DISP = new ItemStack(Material.DISPENSER, 1);

    private String name;
    CPU CPU_MODULE = null;

    public abstract ItemStack[] typeInventory();

    public abstract void updatePower();

    public abstract void disable();

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public static Type[] getTypes(CPU cpu) {
        Type[] listOfTypes = {new OR(cpu), new AND(cpu), new NAND(cpu), new XOR(cpu), new NOR(cpu), new XNOR(cpu), new BlockBreak(cpu), new BlockPlace(cpu)};
        return listOfTypes;
    }
}
