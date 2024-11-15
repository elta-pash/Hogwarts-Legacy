# Hogwarts Legacy Java Implementation

This project implements a simplified simulation of a magical world inspired by *Hogwarts Legacy*. It demonstrates key Java concepts, such as object-oriented programming, enums, interfaces, and design patterns.

## Features
- **Magic Levels**: Enum defining levels (`NOOB`, `ADEPT`, `STUDENT`, `EXPERT`, `MASTER`) with corresponding MP values and string representations.
- **Interfaces**:
  - `MagicSource`: Manages mana provisioning.
  - `MagicEffectRealization`: Handles magical effects like healing, damage, or weakening.
  - `Trader` & `Tradeable`: Manages inventory and transactions.
- **Classes**:
  - `Wizard`: A central character managing spells, items, and trades.
  - `Potion`, `HealthPotion`, `ManaPotion`: Items with magical effects.
  - `Spell`, `AttackingSpell`, `HealingSpell`: Magic capabilities for different effects.
  - `MagicItem`: Abstract base for all magical items.
- **Design Patterns**: Incorporates inheritance and refactoring suggestions for extensibility.

