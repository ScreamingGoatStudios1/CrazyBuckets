package com.jake.crazybuckets;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Random;

public class BucketListener implements Listener {
    @EventHandler
    public void onPlace(PlayerBucketEmptyEvent e) {
        if (CrazyBuckets.isStarted) {
            Player player = e.getPlayer();
            Random random = new Random();
            Location location = player.getLocation();
            int randomNumber = 3;
            int crazy = random.nextInt(randomNumber);

            //spawn mob
            if (crazy == 0) {
                ArrayList<EntityType> mob = new ArrayList<>();
                mob.add(EntityType.SPIDER);
                mob.add(EntityType.CAVE_SPIDER);
                mob.add(EntityType.ENDERMAN);
                mob.add(EntityType.ZOMBIFIED_PIGLIN);
                mob.add(EntityType.PIGLIN);
                mob.add(EntityType.EVOKER);
                mob.add(EntityType.VINDICATOR);
                mob.add(EntityType.PILLAGER);
                mob.add(EntityType.RAVAGER);
                mob.add(EntityType.VEX);
                mob.add(EntityType.ENDERMITE);
                mob.add(EntityType.GUARDIAN);
                mob.add(EntityType.ELDER_GUARDIAN);
                mob.add(EntityType.SHULKER);
                mob.add(EntityType.HUSK);
                mob.add(EntityType.STRAY);
                mob.add(EntityType.PHANTOM);
                mob.add(EntityType.BLAZE);
                mob.add(EntityType.CREEPER);
                mob.add(EntityType.GHAST);
                mob.add(EntityType.MAGMA_CUBE);
                mob.add(EntityType.SILVERFISH);
                mob.add(EntityType.SKELETON);
                mob.add(EntityType.SLIME);
                mob.add(EntityType.ZOMBIE);
                mob.add(EntityType.ZOMBIE_VILLAGER);
                mob.add(EntityType.DROWNED);
                mob.add(EntityType.WITHER_SKELETON);
                mob.add(EntityType.WITCH);
                mob.add(EntityType.HOGLIN);
                mob.add(EntityType.ZOGLIN);
                mob.add(EntityType.PIGLIN_BRUTE);

                location.getWorld().spawnEntity(location, mob.get(random.nextInt(mob.size())));
                player.sendMessage(ChatColor.GREEN + "An enemy mob spawned! :(");
            }
            //useless item
            if (crazy == 1) {
                ArrayList<ItemStack> uselessItems = new ArrayList<>();
                uselessItems.add(new ItemStack(Material.ALLIUM));
                uselessItems.add(new ItemStack(Material.DIRT, 10));
                uselessItems.add(new ItemStack(Material.CLOCK));
                uselessItems.add(new ItemStack(Material.POISONOUS_POTATO));
                uselessItems.add(new ItemStack(Material.DEAD_BUSH));
                uselessItems.add(new ItemStack(Material.DEAD_BRAIN_CORAL));
                uselessItems.add(new ItemStack(Material.DEAD_BRAIN_CORAL_FAN));
                uselessItems.add(new ItemStack(Material.END_STONE, 10));
                uselessItems.add(new ItemStack(Material.MAP));
                uselessItems.add(new ItemStack(Material.GLASS_PANE));
                uselessItems.add(new ItemStack(Material.ACTIVATOR_RAIL, 2));

                location.getWorld().dropItemNaturally(location, uselessItems.get(random.nextInt(uselessItems.size())));
                player.sendMessage(ChatColor.GREEN + "You got a useless item! :(");
            }
            //OP item
            if (crazy == 2) {
                ArrayList<ItemStack> opItems = new ArrayList<>();
                opItems.add(new ItemStack(Material.DIAMOND_BLOCK));
                opItems.add(new ItemStack(Material.NETHERITE_INGOT));
                opItems.add(new ItemStack(Material.GOLD_INGOT, 5));
                opItems.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 16));
                opItems.add(new ItemStack(Material.DIAMOND));
                opItems.add(new ItemStack(Material.GOLD_INGOT));
                opItems.add(new ItemStack(Material.ENCHANTING_TABLE));
                opItems.add(new ItemStack(Material.ANVIL));
                opItems.add(new ItemStack(Material.ELYTRA));
                opItems.add(new ItemStack(Material.FIREWORK_ROCKET, 32));
                opItems.add(new ItemStack(Material.ENDER_PEARL, 3));
                opItems.add(new ItemStack(Material.ENDER_PEARL, 5));
                opItems.add(new ItemStack(Material.ENDER_PEARL, 1));
                opItems.add(new ItemStack(Material.EMERALD_BLOCK, 1));
                opItems.add(new ItemStack(Material.NETHERITE_BLOCK, 1));
                opItems.add(new ItemStack(Material.GOLD_BLOCK, 1));
                opItems.add(new ItemStack(Material.IRON_BLOCK));
                opItems.add(new ItemStack(Material.IRON_INGOT, 5));
                opItems.add(new ItemStack(Material.IRON_INGOT));
                opItems.add(new ItemStack(Material.OBSIDIAN));
                opItems.add(new ItemStack(Material.BEDROCK));
                opItems.add(new ItemStack(Material.SPAWNER));
                opItems.add(new ItemStack(Material.ARROW, 10));
                opItems.add(new ItemStack(Material.BOOKSHELF));
                opItems.add(new ItemStack(Material.DIAMOND_HELMET));
                opItems.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
                opItems.add(new ItemStack(Material.DIAMOND_LEGGINGS));
                opItems.add(new ItemStack(Material.DIAMOND_BOOTS));
                opItems.add(new ItemStack(Material.DIAMOND_SWORD));
                opItems.add(new ItemStack(Material.DIAMOND_AXE));
                opItems.add(new ItemStack(Material.DIAMOND_PICKAXE));
                opItems.add(new ItemStack(Material.DIAMOND_SHOVEL));
                opItems.add(new ItemStack(Material.BOW));
                opItems.add(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 3));
                opItems.add(new ItemStack(Material.GOLDEN_APPLE, 10));

                location.getWorld().dropItemNaturally(location, opItems.get(random.nextInt(opItems.size())));
                player.sendMessage(ChatColor.GREEN + "You got an OP item! :)");
            }
        }
    }
}
