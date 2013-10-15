package me.waicool20.cpu.CPU.Types;

import me.waicool20.cpu.CPU.CPU;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class BlockBreak extends Type {

    public BlockBreak(CPU cpu) {
        CPU_MODULE = cpu;
        setName("BlockBreaker");
    }

    @Override
    public ItemStack[] typeInventory() {
        ItemStack[] typeInventory = {null, null, null, null, null, null, null, null, null,
                redW, redW, redW, NPIS, null, NPIS, redW, redW, redW,
                redW, null, null, null, null, null, null, null, redW,};
        return typeInventory;
    }

    @Override
    public void updatePower() {
        if (CPU_MODULE.getInput1().isPowered() || CPU_MODULE.getInput2().isPowered()) {
            Block block = CPU_MODULE.getOutput().getBlock();
            if (block.getType() != Material.BEDROCK && block.getType() != Material.AIR) {
                block.breakNaturally();
            }
        } else {
        }
    }

    @Override
    public void disable() {
    }
}
