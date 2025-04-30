package com.pdmtaller2.RamirezBarrera_00018523.data.dummy

import com.pdmtaller2.RamirezBarrera_00018523.data.model.Dish
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "La Casa de la Pasta",
        description = "Un lugar acogedor donde disfrutar de la mejor pasta de la ciudad.",
        imageUrl = "",
        categories = listOf("Italian", "Pasta"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Spaghetti Carbonara",
                description = "Espaguetis con salsa carbonara y panceta.",
                imageUrl = "",
            ),
            Dish(
                id = 2,
                name = "Spaghetti Carbonara",
                description = "Espaguetis con salsa carbonara y panceta.",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "El Rincón Mexicano",
        description = "Auténtica comida mexicana con un toque casero.",
        imageUrl = "",
        categories = listOf("Mexican", "Tacos"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Tacos al Pastor",
                description = "Tacos tradicionales con carne al pastor y piña.",
                imageUrl = "",
            ),
            Dish(
                id = 4,
                name = "Guacamole",
                description = "Guacamole fresco con totopos crujientes.",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Sabor Andino",
        description = "Delicias típicas de los Andes con ingredientes frescos y locales.",
        imageUrl = "",
        categories = listOf("Andean", "Traditional"), // Nuevas categorías
        menu = listOf(
            Dish(
                id = 5,
                name = "Cuy Asado",
                description = "Cuy crocante acompañado de papas y salsa de maní.",
                imageUrl = "",
            ),
            Dish(
                id = 6,
                name = "Locro de Papa",
                description = "Sopa cremosa de papas con queso y aguacate.",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "Tokyo Sushi",
        description = "Experiencia auténtica de sushi y cocina japonesa moderna.",
        imageUrl = "",
        categories = listOf("Japanese", "Sushi"), // Nuevas categorías
        menu = listOf(
            Dish(
                id = 7,
                name = "Nigiri de Salmón",
                description = "Bocados de arroz con salmón fresco.",
                imageUrl = "",
            ),
            Dish(
                id = 8,
                name = "Ramen de Cerdo",
                description = "Ramen con caldo tonkotsu, huevo y cerdo marinado.",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 5,
        name = "Pizza Nostra",
        description = "Las mejores pizzas artesanales al horno de leña.",
        imageUrl = "",
        categories = listOf("Italian", "Pizza"), // Reutilizando "Italian"
        menu = listOf(
            Dish(
                id = 9,
                name = "Pizza Margherita",
                description = "Pizza clásica con salsa de tomate, mozzarella y albahaca.",
                imageUrl = "",
            ),
            Dish(
                id = 10,
                name = "Pizza Cuatro Quesos",
                description = "Mozzarella, gorgonzola, parmesano y provolone.",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 6,
        name = "Taquería La Sabrosa",
        description = "Sabor auténtico mexicano servido con alegría.",
        imageUrl = "",
        categories = listOf("Mexican", "Tacos"), // Reutilizando "Mexican", "Tacos"
        menu = listOf(
            Dish(
                id = 11,
                name = "Tacos de Carnitas",
                description = "Tacos suaves de cerdo cocido lentamente con especias.",
                imageUrl = "",
            ),
            Dish(
                id = 12,
                name = "Quesadillas de Huitlacoche",
                description = "Quesadillas con maíz fermentado, un manjar mexicano.",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 7,
        name = "Pasta Bella",
        description = "Especialistas en pasta fresca hecha a mano.",
        imageUrl = "",
        categories = listOf("Italian", "Pasta"),
        menu = listOf(
            Dish(id = 13, name = "Fettuccine Alfredo", description = "Pasta con salsa cremosa de parmesano.", imageUrl = ""),
            Dish(id = 14, name = "Ravioli de Espinaca", description = "Rellenos de espinaca y ricotta en salsa pomodoro.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 8,
        name = "Sushi Zen",
        description = "Fusión japonesa con ingredientes frescos.",
        imageUrl = "",
        categories = listOf("Japanese", "Sushi"),
        menu = listOf(
            Dish(id = 15, name = "Sashimi Mixto", description = "Selección de pescados frescos en finas láminas.", imageUrl = ""),
            Dish(id = 16, name = "Uramaki de Atún Picante", description = "Rollo invertido con atún y salsa picante.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 9,
        name = "Trattoria Napoli",
        description = "Ambiente familiar y recetas tradicionales italianas.",
        imageUrl = "",
        categories = listOf("Italian", "Pizza"),
        menu = listOf(
            Dish(id = 17, name = "Pizza Prosciutto", description = "Pizza con jamón serrano y rúcula.", imageUrl = ""),
            Dish(id = 18, name = "Lasaña Boloñesa", description = "Capas de pasta, carne y salsa bechamel.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 10,
        name = "La Taquiza",
        description = "Comida callejera mexicana con estilo gourmet.",
        imageUrl = "",
        categories = listOf("Mexican", "Tacos"),
        menu = listOf(
            Dish(id = 19, name = "Tacos de Barbacoa", description = "Tacos con carne de res cocida lentamente.", imageUrl = ""),
            Dish(id = 20, name = "Esquites", description = "Granos de maíz con mayonesa, queso y chile.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 11,
        name = "Los Andes Grill",
        description = "Parrilladas con sabores típicos andinos.",
        imageUrl = "",
        categories = listOf("Andean", "Traditional"),
        menu = listOf(
            Dish(id = 21, name = "Anticuchos", description = "Brochetas de corazón de res con papas.", imageUrl = ""),
            Dish(id = 22, name = "Humitas", description = "Masa de maíz cocida al vapor en hojas.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 12,
        name = "Ramen House",
        description = "Tazones calientes de ramen preparados al momento.",
        imageUrl = "",
        categories = listOf("Japanese"),
        menu = listOf(
            Dish(id = 23, name = "Ramen Shoyu", description = "Caldo a base de salsa de soya con fideos y vegetales.", imageUrl = ""),
            Dish(id = 24, name = "Ramen Miso", description = "Ramen con base de miso y cerdo marinado.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 13,
        name = "PizzArte",
        description = "Arte y pizza en un solo lugar.",
        imageUrl = "",
        categories = listOf("Italian", "Pizza"),
        menu = listOf(
            Dish(id = 25, name = "Pizza Diavola", description = "Pizza picante con salami y chile.", imageUrl = ""),
            Dish(id = 26, name = "Calzone", description = "Pizza doblada rellena de jamón y queso.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 14,
        name = "Q' Andina",
        description = "Platos ancestrales con ingredientes orgánicos.",
        imageUrl = "",
        categories = listOf("Andean"),
        menu = listOf(
            Dish(id = 27, name = "Chupe de Quinua", description = "Sopa nutritiva con quinua y verduras.", imageUrl = ""),
            Dish(id = 28, name = "Tamales Andinos", description = "Tamales rellenos con carne y ají.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 15,
        name = "Taco Loco",
        description = "Tacos con actitud y sazón urbana.",
        imageUrl = "",
        categories = listOf("Mexican", "Tacos"),
        menu = listOf(
            Dish(id = 29, name = "Tacos de Pollo Chipotle", description = "Pollo marinado en chipotle con cebolla.", imageUrl = ""),
            Dish(id = 30, name = "Nachos con Queso", description = "Totopos cubiertos de queso fundido y jalapeños.", imageUrl = "")
        )
    ),
    Restaurant(
        id = 16,
        name = "PastAmore",
        description = "Donde el amor por la pasta se convierte en arte.",
        imageUrl = "",
        categories = listOf("Italian", "Pasta"),
        menu = listOf(
            Dish(id = 31, name = "Penne Arrabbiata", description = "Pasta picante con tomate y ajo.", imageUrl = ""),
            Dish(id = 32, name = "Gnocchi al Pesto", description = "Ñoquis con salsa de albahaca y piñones.", imageUrl = "")
        )
    )
)