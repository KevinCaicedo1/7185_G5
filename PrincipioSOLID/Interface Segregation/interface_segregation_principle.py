
"""
Autor: Steven Leiva.
Grupo 5.

Interface Segregation Principle

Ningún Cliente debe ser forzado a depender de métodos que no utiliza.

O

Una interfaz debe describir un conjunto de comportamientos
"""
from abc import abstractmethod


class CoffeeMachine:
    """
    Our interface
    """

    def make_latte(self):
        raise NotImplementedError

    def make_espresso(self):
        raise NotImplementedError

    def make_cappuccino(self):
        raise NotImplementedError


class LatteInterface:
    """
    Latte Interface
    """

    @abstractmethod
    def make_latte(self):
        raise NotImplementedError


class EspressoInterface:
    """
    Espresso Interface
    """

    @abstractmethod
    def make_espresso(self):
        raise NotImplementedError


class CappuccinoInterface:
    """
    Cappuccino Interface
    """

    @abstractmethod
    def make_cappuccino(self):
        raise NotImplementedError


class CoolCoffeeMachine(LatteInterface, EspressoInterface, CappuccinoInterface):
    def make_latte(self):
        print("making latte")

    def make_espresso(self):
        print("making espresso")

    def make_cappuccino(self):
        print("making cappuccino")


class EspressoMachine(EspressoInterface):
    def make_espresso(self):
        print("making espresso")


if __name__ == "__main__":
    CoolCoffeeMachine().make_latte()
    EspressoMachine().make_espresso()