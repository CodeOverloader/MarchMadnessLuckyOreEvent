package dev.codeoverload.marchmadnessevents;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.Random;

public class MarchMadnessEvents extends JavaPlugin implements Listener {

    private static final double DROP_CHANCE = 0.05; // 5% chance
    private ItemStack customItem;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        createCustomItem();
    }

    private void createCustomItem() {
        customItem = new ItemStack(Material.FERN);
        ItemMeta meta = customItem.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Lucky Clover");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        customItem.setItemMeta(meta);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getBlock().getType() == Material.SHORT_GRASS) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
    }
}