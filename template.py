class Taxonomic:

    groups = ["Mammal", "Reptile", "Fish", "Bird", "Amphibian", "Unknown"]

    def __init__(self, group: str, species: str):
        if group.capitalize() in self.groups:
            self.group = group.capitalize()
        else:
            self.group = self.groups[-1]

        self.species = species.capitalize()


class Animal(Taxonomic):

    genders = ["Male", "Female", "Other"]

    def __init__(self, name="Undefined", group="Unknown", species="Undefined", gender="Other"):
        super().__init__(group, species)
        self.name: str = name

        if gender.capitalize() in self.genders:
            self.gender = gender
        else:
            self.gender = self.genders[-1]

    def get_animal(self):
        return self.species


class Toad(Animal):
    def __init__(self, animal: Animal):
        super().__init__(animal.name, animal.group, animal.species, animal.gender)
        self.is_toad = True


class Owl(Animal):
    def __init__(self, animal: Animal):
        super().__init__(animal.name, animal.group, animal.species, animal.gender)
        self.is_owl = True


cj = Toad(Animal("CJ", "Amphibian", "Toad", "Female"))
print("CJ is a", cj.get_animal())

chris = Owl(Animal("Chris", "Mammal", "Owl", "Male"))
print("Chris is a", chris.get_animal())
