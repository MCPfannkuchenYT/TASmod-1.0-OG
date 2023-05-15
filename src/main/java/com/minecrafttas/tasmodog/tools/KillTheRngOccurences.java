package com.minecrafttas.tasmodog.tools;

import java.util.Random;

public class KillTheRngOccurences {

	public static final int[] nextInt = new int[200];
	public static final float[] nextFloat = new float[91];
	public static final double[] nextGaussian = new double[38];
	public static final double[] nextDouble = new double[15];
	public static final long[] nextLong = new long[1];
	public static final boolean[] nextBoolean = new boolean[2];
	public static final double[] random = new double[14];

	public static final String[][] nextIntDesc = {
		{ "endPillarShouldGenerate", "Should an end pillar generate" },
		{ "endPillarChunkOffsetX", "X position of the end pillar" },
		{ "endPillarChunkOffsetZ", "Z position of the end pillar" },
		{ "brewingStandInventorySplit", "Amount of items that get split in 2 different stacks when a brewing stand is destroyed" },
		{ "chestInventorySplit", "Amount of items that get split in 2 different stacks when a chest is destroyed" },
		{ "cropSeedDrop", "Chance of a seed dropping from a crop" },
		{ "cropGrowthChance", "Chance of seed growing on a block tick" },
		{ "dispenserInventorySplit", "Amount of items that get split in 2 different stacks when a dispenser is destroyed" },
		{ "dragonEggTpPositionX0", "X position of a dragon egg when teleporting around" },
		{ "dragonEggTpPositionX1", "X position of a dragon egg when teleporting around" },
		{ "dragonEggTpPositionY0", "Y position of a dragon egg when teleporting around" },
		{ "dragonEggTpPositionY1", "Y position of a dragon egg when teleporting around" },
		{ "dragonEggTpPositionZ0", "Z position of a dragon egg when teleporting around" },
		{ "dragonEggTpPositionZ1", "Z position of a dragon egg when teleporting around" },
		{ "farmlandDestroy", "Chance of farmland being destroyed when walking on it" },
		{ "fireFuelBurn", "Amount of fire loosing fuel" },
		{ "fireFuelExtinguish", "Chance of fire extinguishing without fuel" },
		{ "fireSpreadChance", "Chance of fire spreading" },
		{ "fireSpreadChanceStrength", "Chance of fire spreading with strength" },
		{ "fireCatchChance", "Chance of block catching fire" },
		{ "fireCatchLevelChance", "Chance of block catching fire with a non-zero value of fuel" },
		{ "fireStayaliveChance", "Chance of fire staying alive" },
		{ "lavaShouldDecay", "Whether lava should decay or not" },
		{ "furnaceInventorySplit", "Amount of items that get split in 2 different stacks when a furnace is destroyed" },
		{ "glowstoneFortuneBonus", "Amount of additional glowstone when destroyed with fortune" },
		{ "glowstoneDropAmount", "Amount of glowstone dropped" },
		{ "grassSpreadPositionX", "X position of grass spreading" },
		{ "grassSpreadPositionY", "Y position of grass spreading" },
		{ "grassSpreadPositionZ", "Z position of grass spreading" },
		{ "gravelFlintDrop", "Chance of flint dropping" },
		{ "leavesSaplingDrop", "Whether a sapling should drop from a decaying leaf" },
		{ "leverPlaceOrientation", "Orientation of the lever when placed on top of a block" },
		{ "melonDropAmount", "Amount of melons dropped" },
		{ "melonDropFortuneBonus", "Amount of additional melons dropped with fortune" },
		{ "mushroomSpreadChance", "Should a mushroom spread" },
		{ "mushroomSpreadPositionX", "X position of mushroom spreading" },
		{ "mushroomSpreadPositionY1", "Y position of mushroom spreading" },
		{ "mushroomSpreadPositionY2", "Y position of mushroom spreading" },
		{ "mushroomSpreadPositionZ", "Z position of mushroom spreading" },
		{ "mushroomSpreadPositionOnFailX", "X of the new position if the old position is invalid for a mushroom to spawn" },
		{ "mushroomSpreadPositionOnFailY1", "Y of the new position if the old position is invalid for a mushroom to spawn" },
		{ "mushroomSpreadPositionOnFailY2", "Y of the new position if the old position is invalid for a mushroom to spawn" },
		{ "mushroomSpreadPositionOnFailZ", "Z of the new position if the old position is invalid for a mushroom to spawn" },
		{ "mushroomDrop", "Amount of mushroom drops" },
		{ "myceliumSpreadX", "Mycelium spread position x" },
		{ "myceliumSpreadY", "Mycelium spread position y" },
		{ "myceliumSpreadZ", "Mycelium spread position z" },
		{ "netherWartShouldGrow", "Should nether wart grow" },
		{ "netherWartDropQuantity1", "Amount of nether wart drops" },
		{ "netherWartDropQuantity2", "Amount of nether wart drops" },
		{ "lapisOreDropQuantity2", "Amount of lapis dropped from lapis ore" },
		{ "lapisOreDropQuantity1", "Amount of lapis dropped from lapis ore" },
		{ "redstoneOreDropQuantity2", "Amount of redstone dropped from redstone ore" },
		{ "redstoneOreDropQuantity1", "Amount of redstone dropped from redstone ore" },
		{ "saplingAdvanceStage", "Should sapling advance growth stage" },
		{ "saplingBigTree", "Should generate big tree from sapling" },
		{ "lavaSpreadFire", "Amount of fire blocks to spread" },
		{ "lavaSpreadFirePositionX", "Position x of fire to spread" },
		{ "lavaSpreadFirePositionZ", "Position z of fire to spread" },
		{ "stemDropFortune", "Additional seeds dropped by stem with fortune" },
		{ "stemShouldGrow", "Should stem advance growth" },
		{ "stemGrowDirection", "Direction stem should grow" },
		{ "tallGrassDropRolls", "Amount of roles for tall grass drop" },
		{ "tallGrassDrop", "Should drop seed" },
		{ "tntFuseNeighboringTnt", "TNT Fuse of blocks nearby an explosion" },
		{ "vineGrow1", "Should vine grow/spread" },
		{ "vineGrow2", "Should vine grow/spread" },
		{ "vineGrow3", "Should vine grow/spread" },
		{ "vineGrow4", "Should vine grow/spread" },
		{ "vineGrow5", "Should vine grow/spread" },
		{ "enchantmentModifierLiving", "Enchantment modifier of living entities" },
		{ "enchantmentItemLevel1", "Enchantment item level" },
		{ "enchantmentItemLevel2", "Enchantment item level" },
		{ "enchantmentItemLevel3", "Enchantment item level" },
		{ "enchantmentModifierDamage", "Enchantment modifier of damage" },
		{ "enchantmentLevel1", "Enchantment level of item" },
		{ "enchantmentLevel2", "Enchantment level of item" },
		{ "enchantmentLevel5", "Enchantment level of item" },
		{ "animalExperience", "Amount of experience to drop on animal death" },
		{ "arrowCritDamageModifier", "Critical hit additional damage on arrow" },
		{ "blazeRodDropQuantity", "Quantity of blaze rods dropped on blaze death" },
		{ "chickenLayEgg1", "Lay egg delay" },
		{ "chickenLayEgg2", "Lay egg delay" },
		{ "chickenFeatherDropQuantity1", "Quantity of feather to drop on chicken death" },
		{ "chickenFeatherDropQuantity2", "Quantity of feather to drop on chicken death" },
		{ "cowLeatherDropQuantity1", "Quantity of leather to drop on cow death" },
		{ "cowLeatherDropQuantity2", "Quantity of leather to drop on cow death" },
		{ "cowBeefDropQuantity1", "Quantity of beef to drop on cow death" },
		{ "cowBeefDropQuantity2", "Quantity of beef to drop on cow death" },
		{ "entityCreatureNewPath1", "Should entity get new path" },
		{ "entityCreatureNewPath2", "Should entity get new path" },
		{ "entityCreatureNewPath3", "Should entity get new path" },
		{ "entityCreatureUpdateState", "Should entity update entity action state" },
		{ "entityCreaturePathOffsetX", "Entity path generation offset x" },
		{ "entityCreaturePathOffsetY", "Entity path generation offset y" },
		{ "entityCreaturePathOffsetZ", "Entity path generation offset z" },
		{ "creeperRecordDropId", "Which record should creeper drop on death by skeleton" },
		{ "enderdragonUpdateHealCrystal", "Should enderdragon chance end crystal heal point" },
		{ "enderdragonPerchPlayer", "Should enderdragon perch player" },
		{ "enderdragonPerchPlayerIndex", "Index of player to perch" },
		{ "eggSpawnChance", "Chance of spawning chickens on egg throw" },
		{ "eggSpawn4Chance", "Chance of spawning 4 chickens on egg throw" },
		{ "endereyeBreak", "Should endereye break" },
		{ "endermanTeleportOffsetY0", "Enderman teleport offset y" },
		{ "endermanPearlDropQuantity", "Quantity of enderpearls to drop on enderman" },
		{ "endermanTeleportOffsetY1", "Enderman teleport offset y" },
		{ "endermanPickupItem", "Should enderman pickup new item" },
		{ "endermanPickupItem2", "Should enderman pickup new item even if already carrying one" },
		{ "rodUpdateCatchableTicks", "Fishing rod should update catchable ticks" },
		{ "rodCatchableTicks", "Fishing rod catchable ticks" },
		{ "ghastSpawnChance", "Ghast spawning chance" },
		{ "ghastCourseChange", "Cooldown for ghast changing course" },
		{ "ghastTearDropQuantity1", "Quantity of ghast tears to drop on ghast death" },
		{ "ghastTearDropQuantity2", "Quantity of ghast tears to drop on ghast death" },
		{ "ghastGunpowderDropQuantity1", "Quantity of gunpowder to drop on ghast death" },
		{ "ghastGunpowderDropQuantity2", "Quantity of gunpowder to drop on ghast death" },
		{ "lightningBoltLivingTime", "Living time of a lightning bolt" },
		{ "lightningBoltTargetX", "Lightning bolt target block" },
		{ "lightningBoltTargetY", "Lightning bolt target block" },
		{ "lightningBoltTargetZ", "Lightning bolt target block" },
		{ "lightningBoltFireState", "Should lightning block set fire to block" },
		{ "entityLivingDropCount1", "Amount of items to drop on death" },
		{ "entityLivingDropCount2", "Amount of items to drop on death" },
		{ "entityLivingChasePlayerTime", "Amount of ticks to chase player for" },
		{ "entityLivingDespawnChance", "Chance of entity despawning" },
		{ "minecartContentSplit1", "Amount of items that get split in 2 different stacks when a minecart is destroyed" },
		{ "minecartContentSplit2", "Amount of items that get split in 2 different stacks when a minecart is destroyed" },
		{ "mobSpawnSkyLightLevel", "Sky light level for mob to spawn" },
		{ "mobSpawnLightLevel", "Light level for mob to spawn" },
		{ "paintingRng", "Which painting to display" },
		{ "pigZombieRottenFleshDropQuantity", "Quantity of rotten flesh to drop on pigman death" },
		{ "pigZombieGoldNuggetDropQuantity", "Quantity of gold nuggets to drop on pigman death" },
		{ "pigZombieAngerLevel", "Pigman Anger time" },
		{ "playerCritDamageModifier", "Critical hit additional damage for player" },
		{ "playerRespirationModifier", "Respiration player rng" },
		{ "sheepColor", "Color of sheep" },
		{ "sheepPinkColor", "Chance of pink sheep" },
		{ "sheepWoolCount", "Amount of wool to drop from a sheep" },
		{ "silverfishHideInBlock", "Silverfish hide in block" },
		{ "skeletonArrowDropQuantity", "Quantity of arrows to drop on skeleton death" },
		{ "skeletonBoneDropQuantity", "Quantity of bone to drop on skeleton death" },
		{ "slimeRespawnCount", "Slime respawn count" },
		{ "slimeJumpDelay0", "Slime jump delay" },
		{ "slimeCanSpawnChance", "Can slime spawn here" },
		{ "slimeSize", "Initial slime size" },
		{ "slimeJumpDelay1", "Initial slime jump delay" },
		{ "snowmanDropQuantity", "Quantity of snowballs to drop on snowman death" },
		{ "snowmanAttackChance", "Chance of snowman chosing a target" },
		{ "snowmanAttackEntity", "Snowman attack entity" },
		{ "spiderLoseFocus", "Chance of spider losing focus" },
		{ "spiderJumpAttackChance", "Chance of spider attacking with a jump" },
		{ "spiderEyeChance1", "Chance of spider dropping a spider eye" },
		{ "spiderEyeChance2", "Chance of spider dropping a spider eye" },
		{ "squidDropItemChance", "Squid Ink sack drop rate" },
		{ "squidMotionSwitch", "Chance of the squid changing its motion" },
		{ "entityDeathXP", "XP orbs dropped on entity death" },
		{ "wolfTameChance", "Chance of taming a dog" },
		{ "wolfAttackChance", "Chance of a wolf chosing a target" },
		{ "wolfAttackEntity", "Wolf attack entity" },
		{ "wolfJumpAttackChance", "Chance of wolf attacking with a jump" },
		{ "explosionFireChance", "Explosion fire chance" },
		{ "bonemealSpreadX", "Bonemeal spread position x" },
		{ "bonemealSpreadY1", "Bonemeal spread position y" },
		{ "bonemealSpreadY2", "Bonemeal spread position y" },
		{ "bonemealSpreadZ", "Bonemeal spread position z" },
		{ "bonemealTallGrassChance", "Bonemeal tall grass chance" },
		{ "bonemealPlantChance", "Bonemeal plant chance" },
		{ "itemUnbreaking", "Unbreaking durability loss" },
		{ "spawnerOffsetX1", "Entity spawner spawn offset x" },
		{ "spawnerOffsetX2", "Entity spawner spawn offset x" },
		{ "spawnerOffsetZ1", "Entity spawner spawn offset z" },
		{ "spawnerOffsetZ2", "Entity spawner spawn offset z" },
		{ "spawnerPointX", "Entity spawning spot x" },
		{ "spawnerPointY", "Entity spawning spot y" },
		{ "spawnerPointZ", "Entity spawning spot z" },
		{ "spawnerSpiderJockey", "Spider jokey chance" },
		{ "netherPortalOrientation", "Orientation of the nether portal" },
		{ "dispenserSlot", "Defines slot to dispense" },
		{ "mobSpawnerSpawnOffsetY", "Mob spawner spawn offset y" },
		{ "mobSpawnerSpawnDelay", "Delay of mob spawner" },
		{ "weightedRandom", "Weighted Random RNG with various usecases such as enchantments" },
		{ "worldInitialLCG0", "Initial world load LCG" },
		{ "worldInitialLCG1", "Initial world load LCG" },
		{ "worldInitialLCG2", "Initial world load LCG" },
		{ "worldThunderTime1", "New thunder time if it's thundering" },
		{ "worldThunderTime2", "New thunder time" },
		{ "worldRainTime1", "New rain time if it's raining" },
		{ "worldRainTime2", "New rain time" },
		{ "worldInitialSpawnOffsetX0", "Initial spawn location offset x" },
		{ "worldInitialSpawnOffsetX1", "Initial spawn location offset x" },
		{ "worldInitialSpawnOffsetZ0", "Initial spawn location offset z" },
		{ "worldInitialSpawnOffsetZ1", "Initial spawn location offset z" },
		{ "worldLightingBolt", "Whether a lighting bold should strike" },
		{ "worldLightTypeUpdateX", "Light type update offset x" },
		{ "worldLightTypeUpdateY", "Light type update offset y" },
		{ "worldLightTypeUpdateZ", "Light type update offset z" },
		{ "worldSpawnOffsetX0", "Spawn location offset x" },
		{ "worldSpawnOffsetX1", "Spawn location offset x" },
		{ "worldSpawnOffsetZ0", "Spawn location offset z" },
		{ "worldSpawnOffsetZ1", "Spawn location offset z" },
	};

	public static final String[][] nextFloatDesc = {
		{ "endDragonRotation", "Defines the rotation of the ender dragon on spawn" },
		{ "blockDropChance", "Chance of item dropping from block" },
		{ "blockDropPositionX", "X position of the dropped item" },
		{ "blockDropPositionY", "Y position of the dropped item" },
		{ "blockDropPositionZ", "Z position of the dropped item" },
		{ "brewingStandInventoryDropPositionX", "X position of the dropped inventory from a destroyed brewing stand" },
		{ "brewingStandInventoryDropPositionY", "Y position of the dropped inventory from a destroyed brewing stand" },
		{ "brewingStandInventoryDropPositionZ", "Z position of the dropped inventory from a destroyed brewing stand" },
		{ "chestInventoryDropPositionX", "X position of the dropped inventory from a destroyed chest" },
		{ "chestInventoryDropPositionY", "Y position of the dropped inventory from a destroyed chest" },
		{ "chestInventoryDropPositionZ", "Z position of the dropped inventory from a destroyed chest" },
		{ "cropDropPositionX", "X position of seed dropped from crop" },
		{ "cropDropPositionY", "Y position of seed dropped from crop" },
		{ "cropDropPositionZ", "Z position of seed dropped from crop" },
		{ "dispenserInventoryDropPositionX", "X position of the dropped inventory from a destroyed dispenser" },
		{ "dispenserInventoryDropPositionY", "Y position of the dropped inventory from a destroyed dispenser" },
		{ "dispenserInventoryDropPositionZ", "Z position of the dropped inventory from a destroyed dispenser" },
		{ "furnaceInventoryDropPositionX", "X position of the dropped inventory from a destroyed furnace" },
		{ "furnaceInventoryDropPositionY", "Y position of the dropped inventory from a destroyed furnace" },
		{ "furnaceInventoryDropPositionZ", "Z position of the dropped inventory from a destroyed furnace" },
		{ "jukeBoxRecordDropMotionX", "X motion of record when flying out of a jukebox" },
		{ "jukeBoxRecordDropMotionY", "Y motion of record when flying out of a jukebox" },
		{ "jukeBoxRecordDropMotionZ", "Z motion of record when flying out of a jukebox" },
		{ "snowDropPositionX", "Position x of snowball dropped by snow" },
		{ "snowDropPositionY", "Position y of snowball dropped by snow" },
		{ "snowDropPositionZ", "Position z of snowball dropped by snow" },
		{ "stemDropPositionX", "Position x of seeds dropped by stem" },
		{ "stemDropPositionY", "Position y of seeds dropped by stem" },
		{ "stemDropPositionZ", "Position z of seeds dropped by stem" },
		{ "enchantmentLevel3", "Enchantment level of item" },
		{ "enchantmentLevel4", "Enchantment level of item" },
		{ "entityPushVelocity", "Velocity applied to entities to push out of blocks" },
		{ "arrowInGroundX", "Arrow motion if inside ground x" },
		{ "arrowlnGroundY", "Arrow motion if inside ground y" },
		{ "arrowInGroundZ", "Arrow motion if inside ground z" },
		{ "entityCreatureShouldJump", "Should entity creature jump in water" },
		{ "enderdragonFlyDeviationX1", "Enderdragon fly position deviation x" },
		{ "enderdragonFlyDeviationY1", "Enderdragon fly position deviation x" },
		{ "enderdragonFlyDeviationZ1", "Enderdragon fly position deviation z" },
		{ "enderdragonFlyGoalY", "Enderdragon fly position y" },
		{ "enderdragonFlyGoalX", "Enderdragon fly position x" },
		{ "enderdragonFlyGoalZ", "Enderdragon fly position z" },
		{ "endermanShouldTeleport", "Enderman teleport chance" },
		{ "fireballInGroundX", "Fireball motion if inside ground x" },
		{ "fireballInGroundY", "Fireball motion if inside ground y" },
		{ "fireballInGroundZ", "Fireball motion if inside ground z" },
		{ "rodMotionInGroundX", "Fishing rod motion if inside ground x" },
		{ "rodMotionInGroundY", "Fishing rod motion if inside ground y" },
		{ "rodMotionInGroundZ", "Fishing rod motion if inside ground z" },
		{ "rodBobMotion1", "Fishing rod bobbing motion" },
		{ "rodBobMotion2", "Fishing rod bobbing motion" },
		{ "rodBobMotion3", "Fishing rod bobbing motion" },
		{ "ghastWaypointX", "Ghast waypoint x" },
		{ "ghastWaypointY", "Ghast waypoint y" },
		{ "ghastWaypointZ", "Ghast waypoint z" },
		{ "entityLivingChasePlayer0", "Should a new player be chased" },
		{ "entityLivingChasePlayerYawVelocity0", "Random yaw velocity if no player was found to chase" },
		{ "entityLivingChasePlayer1", "Should yaw velocity be updated" },
		{ "entityLivingChasePlayerYawVelocity1", "Random yaw velocity if no player was found to chase" },
		{ "entityLivingShouldJump", "Should entity jump" },
		{ "minecartInventoryDropPositionX0", "X position of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropPositionY0", "Y position of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropPositionZ0", "Z position of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropPositionX1", "X position of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropPositionY1", "Y position of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropPositionZ1", "Z position of the dropped item from a destroyed minecart" },
		{ "playerDropMotionXZ1", "Player item drop motion x z" },
		{ "playerDropMotionXZ2", "Player item drop motion x z" },
		{ "playerDropMotionXZ3", "Player item drop motion x z" },
		{ "playerDropMotionXZ4", "Player item drop motion x z" },
		{ "playerDropMotionY1", "Player item drop motion y" },
		{ "playerDropMotionY2", "Player item drop motion y" },
		{ "sheepWoolMotionY", "Motion Y of dropped wool from sheep" },
		{ "sheepWoolMotionX1", "Motion X of dropped wool from sheep" },
		{ "sheepWoolMotionX2", "Motion X of dropped wool from sheep" },
		{ "sheepWoolMotionZ1", "Motion Z of dropped wool from sheep" },
		{ "sheepWoolMotionZ2", "Motion Z of dropped wool from sheep" },
		{ "skeletonFireChance", "Skeleton get set on fire chance" },
		{ "slimeRespawnRotation", "Rotation of smaller slime variants on spawn" },
		{ "slimeJumpStrafe", "Slime strafing after jumping" },
		{ "squidMotionVecXZ", "Squid motion X" },
		{ "squidMotionVecY", "Squid motion Y" },
		{ "xpOrbLavaOffsetX1", "XP orb motion in lava x" },
		{ "xpOrbLavaOffsetX2", "XP orb motion in lava x" },
		{ "xpOrbLavaOffsetZ1", "XP orb motion in lava z" },
		{ "xpOrbLavaOffsetZ2", "XP orb motion in lava z" },
		{ "zombieFireChance", "Zombie get set on fire chance" },
		{ "explosionDropChance", "Explosion drop chance" },
		{ "itemPotionEffectProbability", "Probatility of gettting the effect after eating a food" },
		{ "spawnerSpawnRotation", "Entity spawning rotation" },
		{ "mobSpawnerSpawnRotation", "Rotation of the mob spawned by a mob spawner" },
	};

	public static final String[][] nextGaussianDesc = {
		{ "brewingStandInventoryDropMotionX", "X motion of the dropped inventory from a destroyed brewing stand" },
		{ "brewingStandInventoryDropMotionY", "Y motion of the dropped inventory from a destroyed brewing stand" },
		{ "brewingStandInventoryDropMotionZ", "Z motion of the dropped inventory from a destroyed brewing stand" },
		{ "chestInventoryDropMotionX", "X motion of the dropped inventory from a destroyed chest" },
		{ "chestInventoryDropMotionY", "Y motion of the dropped inventory from a destroyed chest" },
		{ "chestStandInventoryDropMotionZ", "Z motion of the dropped inventory from a destroyed chest" },
		{ "dispenserInventoryDropMotionX", "X motion of the dropped inventory from a destroyed dispenser" },
		{ "dispenserInventoryDropMotionY1", "Y motion of the dropped inventory from a destroyed dispenser" },
		{ "dispenserInventoryDropMotionY2", "Z motion of the dropped inventory from a destroyed dispenser" },
		{ "dispenserDispensingMotionX", "X motion of the dispensed item" },
		{ "dispenserDispensingMotionY", "Y motion of the dispensed item" },
		{ "dispenserDispensingMotionZ", "Z motion of the dispensed item" },
		{ "furnaceInventoryDropMotionX", "X motion of the dropped inventory from a destroyed furnace" },
		{ "furnaceInventoryDropMotionY1", "Y motion of the dropped inventory from a destroyed furnace" },
		{ "furnaceInventoryDropMotionY2", "Z motion of the dropped inventory from a destroyed furnace" },
		{ "arrowHeadingX", "Entity arrow heading X" },
		{ "arrowHeadingY", "Entity arrow heading Y" },
		{ "arrowHeadingZ", "Entity arrow heading Z" },
		{ "blazePathHeightOffsetY", "Some offset in height that causes the blaze to go higher" },
		{ "blazeFireballOffsetX", "Blaze fireball offset x" },
		{ "blazeFireballOffsetZ", "Blaze fireball offset z" },
		{ "enderdragonFlyDeviationX", "Enderdragon fly position deviation x" },
		{ "enderdragonFlyDeviationZ", "Enderdragon fly position deviation z" },
		{ "fireballMotionOffsetX", "Fireball motion inaccuracy x" },
		{ "fireballMotionOffsetY", "Fireball motion inaccuracy y" },
		{ "fireballMotionOffsetZ", "Fireball rod motion inaccuracy z" },
		{ "rodMotionOffsetX", "Fishing rod motion inaccuracy x" },
		{ "rodMotionOffsetY", "Fishing rod motion inaccuracy y" },
		{ "rodMotionOffsetZ", "Fishing rod motion inaccuracy z" },
		{ "minecartInventoryDropMotionX0", "X motion of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropMotionY0", "Y motion of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropMotionZ0", "Z motion of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropMotionX1", "X motion of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropMotionY1", "Y motion of the dropped item from a destroyed minecart" },
		{ "minecartInventoryDropMotionZ1", "Z motion of the dropped item from a destroyed minecart" },
		{ "entityThrowableHeadingX", "Entity throwable heading X" },
		{ "entityThrowableHeadingY", "Entity throwable heading Y" },
		{ "entityThrowableHeadingZ", "Entity throwable heading Z" },
	};

	public static final String[][] nextDoubleDesc = {
		{ "dispenserDispensingForce", "Initial force of a dispensed item" },
		{ "endermanTeleportOffsetX0", "Enderman teleport offset x" },
		{ "endermanTeleportOffsetZ0", "Enderman teleport offset z" },
		{ "endermanPickBlockX0", "Enderman pick block offset x" },
		{ "endermanPickBlockY0", "Enderman pick block offset y" },
		{ "endermanPickBlockZ0", "Enderman pick block offset z" },
		{ "endermanPickBlockX1", "Enderman pick block offset x" },
		{ "endermanPickBlockY1", "Enderman pick block offset y" },
		{ "endermanPickBlockZ1", "Enderman pick block offset z" },
		{ "endermanTeleportOffsetX1", "Enderman teleport offset x" },
		{ "endermanTeleportOffsetZ1", "Enderman teleport offset z" },
		{ "mobSpawnerSpawnOffsetX0", "Mob spawner spawn offset x" },
		{ "mobSpawnerSpawnOffsetX1", "Mob spawner spawn offset x" },
		{ "mobSpawnerSpawnOffsetZ0", "Mob spawner spawn offset z" },
		{ "mobSpawnerSpawnOffsetZ1", "Mob spawner spawn offset z" },
	};

	public static final String[][] nextLongDesc = {
		{ "worldSeed", "World seed" },
	};

	public static final String[][] nextBooleanDesc = {
		{ "sheepBabyColor", "Inherit parent sheep color" },
		{ "silverfishBlockInfested", "Should silverfish stop looking for nearby infested blocks" },
	};

	public static final String[][] randomDesc = {
		{ "entityItemInitialRotationYaw", "Initial rotation yaw of dropped item entity" },
		{ "entityItemInitialMotionX", "Initial motion x of dropped item entity" },
		{ "entityItemInitialMotionZ", "Initial motion z of dropped item entity" },
		{ "entityLivingKnockback1", "Determines the random knockback direction if two entities are inside of each other" },
		{ "entityLivingKnockback2", "Determines the random knockback direction if two entities are inside of each other" },
		{ "entityLivingKnockback3", "Determines the random knockback direction if two entities are inside of each other" },
		{ "entityLivingKnockback4", "Determines the random knockback direction if two entities are inside of each other" },
		{ "entityLivingAttackYaw", "Entity attack yaw if no entity attacked" },
		{ "entityLivingInitialRotation", "Initial rotation of spawning entity living" },
		{ "primedTntMotion", "Motion x z of primed tnt" },
		{ "xpOrbRotation", "Rotation of XP orb on spawn" },
		{ "xpOrbInitialMotionX", "Motion x of XP orb on spawn" },
		{ "xpOrbInitialMotionY", "Motion y of XP orb on spawn" },
		{ "xpOrbInitialMotionZ", "Motion z of XP orb on spawn" },
	};
	
	/**
	 * Workaround for sometimes seeded sometimes not spawning.
	 * Use world random if preload
	 */
	public static boolean spawnerAnimals;

	public static int nextIntSpawnerAnimals(Random og, int i) {
		return spawnerAnimals ? og.nextInt() : nextInt[i];
	}

	public static float nextFloatSpawnerAnimals(Random og, int i) {
		return spawnerAnimals ? og.nextFloat() : nextFloat[i];
	}

}