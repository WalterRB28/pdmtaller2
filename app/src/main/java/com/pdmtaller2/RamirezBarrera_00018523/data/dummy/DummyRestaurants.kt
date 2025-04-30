package com.pdmtaller2.RamirezBarrera_00018523.data.dummy

import com.pdmtaller2.RamirezBarrera_00018523.data.model.Dish
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant

val restaurants = listOf(
    // 🅐 Comida Rápida
    Restaurant(
        id = 1,
        name = "Burger Express",
        description = "Hamburguesas rápidas y sabrosas",
        imageUrl = "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_website/es/cms/SEO/recipes/albondigas-caseras-de-cerdo-con-salsa-barbacoa.jpeg",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(1, "Cheeseburger Clásica", "Hamburguesa con queso cheddar, lechuga y tomate", "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_website/es/cms/SEO/recipes/albondigas-caseras-de-cerdo-con-salsa-barbacoa.jpeg"),
            Dish(2, "Papas Fritas", "Crujientes papas fritas con sal", "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_website/es/cms/SEO/recipes/albondigas-caseras-de-cerdo-con-salsa-barbacoa.jpeg"),
            Dish(3, "Combo Express", "Hamburguesa, papas y bebida", "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_website/es/cms/SEO/recipes/albondigas-caseras-de-cerdo-con-salsa-barbacoa.jpeg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza al Paso",
        description = "Pizzas listas en minutos",
        imageUrl = "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_s3/image/HF_Y24_R16_W42_ES_ESSGP30616-2_Main__edit_meat_high-a670615d.jpg",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(4, "Pizza Pepperoni", "Pizza con salsa de tomate, queso mozzarella y pepperoni", "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_s3/image/HF_Y24_R16_W42_ES_ESSGP30616-2_Main__edit_meat_high-a670615d.jpg"),
            Dish(5, "Pizza Hawaiana", "Con piña y jamón", "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_s3/image/HF_Y24_R16_W42_ES_ESSGP30616-2_Main__edit_meat_high-a670615d.jpg"),
            Dish(6, "Calzone Express", "Calzone relleno de queso y jamón", "https://img.hellofresh.com/w_3840,q_auto,f_auto,c_fill,fl_lossy/hellofresh_s3/image/HF_Y24_R16_W42_ES_ESSGP30616-2_Main__edit_meat_high-a670615d.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "Pollo Crocante",
        description = "Especialistas en pollo frito",
        imageUrl = "https://www.bbva.com/wp-content/uploads/2023/04/cocina-de-aprovechamiento.jpg",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(7, "Pieza de Pollo", "Pollo frito crujiente", "https://www.bbva.com/wp-content/uploads/2023/04/cocina-de-aprovechamiento.jpg"),
            Dish(8, "Combo Familiar", "8 piezas de pollo, papas y soda", "https://www.bbva.com/wp-content/uploads/2023/04/cocina-de-aprovechamiento.jpg"),
            Dish(9, "Alitas BBQ", "Alitas con salsa BBQ", "https://www.bbva.com/wp-content/uploads/2023/04/cocina-de-aprovechamiento.jpg")
        )
    ),

    // 🅑 Comida Mexicana
    Restaurant(
        id = 4,
        name = "El Taco Loco",
        description = "Tacos y antojitos tradicionales",
        imageUrl = "https://i.pinimg.com/736x/90/d1/45/90d145387e231599ba684e419213f8d8.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(10, "Tacos al Pastor", "Tacos con carne marinada y piña", "https://i.pinimg.com/736x/90/d1/45/90d145387e231599ba684e419213f8d8.jpg"),
            Dish(11, "Quesadillas", "Tortilla de maíz rellena de queso", "https://i.pinimg.com/736x/90/d1/45/90d145387e231599ba684e419213f8d8.jpg"),
            Dish(12, "Tacos de Asada", "Carne asada, cebolla y cilantro", "https://i.pinimg.com/736x/90/d1/45/90d145387e231599ba684e419213f8d8.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Burritos MX",
        description = "Burritos llenos de sabor",
        imageUrl = "https://revistavive.com/wp-content/uploads/2019/01/aa.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(13, "Burrito Clásico", "Frijoles, arroz, carne y guacamole", "https://revistavive.com/wp-content/uploads/2019/01/aa.jpg"),
            Dish(14, "Burrito Veggie", "Relleno de vegetales y frijoles", "https://revistavive.com/wp-content/uploads/2019/01/aa.jpg"),
            Dish(15, "Burrito Picante", "Con salsa habanero", "https://revistavive.com/wp-content/uploads/2019/01/aa.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "Sazón Azteca",
        description = "Platillos típicos de México",
        imageUrl = "https://lopezdoriga.com/wp-content/uploads/2015/09/comida_rapida1.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(16, "Enchiladas Verdes", "Tortillas rellenas bañadas en salsa verde", "https://lopezdoriga.com/wp-content/uploads/2015/09/comida_rapida1.jpg"),
            Dish(17, "Pozole", "Sopa tradicional de maíz y carne", "https://lopezdoriga.com/wp-content/uploads/2015/09/comida_rapida1.jpg"),
            Dish(18, "Chiles Rellenos", "Pimientos rellenos de carne y queso", "https://lopezdoriga.com/wp-content/uploads/2015/09/comida_rapida1.jpg")
        )
    ),

    // 🅒 Comida Italiana
    Restaurant(
        id = 7,
        name = "La Trattoria",
        description = "Auténtica cocina italiana",
        imageUrl = "https://cdn.aarp.net/content/dam/aarp/members-only/member-benefits/2024/05/1140-martinez-mexican-mesa-cookbook-papitas-esp.imgcache.rev.web.1000.575.jpg",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(19, "Lasagna", "Pasta en capas con carne y salsa de tomate", "https://cdn.aarp.net/content/dam/aarp/members-only/member-benefits/2024/05/1140-martinez-mexican-mesa-cookbook-papitas-esp.imgcache.rev.web.1000.575.jpg"),
            Dish(20, "Spaghetti Bolognese", "Pasta con salsa de carne", "https://cdn.aarp.net/content/dam/aarp/members-only/member-benefits/2024/05/1140-martinez-mexican-mesa-cookbook-papitas-esp.imgcache.rev.web.1000.575.jpg"),
            Dish(21, "Fettuccine Alfredo", "Fettuccine en salsa cremosa de queso", "https://cdn.aarp.net/content/dam/aarp/members-only/member-benefits/2024/05/1140-martinez-mexican-mesa-cookbook-papitas-esp.imgcache.rev.web.1000.575.jpg")
        )
    ),
    Restaurant(
        id = 8,
        name = "Pasta e Vino",
        description = "Pasta artesanal y vinos selectos",
        imageUrl = "https://cdn.tecnohotelnews.com/2022/12/2MdTZZdX-siete-claves-para-ofrecer-platos-saludables-atractivos-a-los-comensales.jpg",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(22, "Penne Arrabbiata", "Pasta picante en salsa de tomate", "https://cdn.tecnohotelnews.com/2022/12/2MdTZZdX-siete-claves-para-ofrecer-platos-saludables-atractivos-a-los-comensales.jpg"),
            Dish(23, "Ravioli de Espinaca", "Rellenos de espinaca y ricotta", "https://cdn.tecnohotelnews.com/2022/12/2MdTZZdX-siete-claves-para-ofrecer-platos-saludables-atractivos-a-los-comensales.jpg"),
            Dish(24, "Bruschetta", "Pan tostado con tomate y albahaca", "https://cdn.tecnohotelnews.com/2022/12/2MdTZZdX-siete-claves-para-ofrecer-platos-saludables-atractivos-a-los-comensales.jpg")
        )
    ),
    Restaurant(
        id = 9,
        name = "Pizza Napoli",
        description = "Pizzas al estilo napolitano",
        imageUrl = "",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(25, "Pizza Margarita", "Con tomate, mozzarella y albahaca", ""),
            Dish(26, "Pizza Cuatro Quesos", "Con mezcla de quesos italianos", ""),
            Dish(27, "Pizza Prosciutto", "Con jamón serrano y rúcula", "")
        )
    ),

    // 🅓 Comida Asiática
    Restaurant(
        id = 10,
        name = "Wok & Roll",
        description = "Salteados asiáticos al instante",
        imageUrl = "",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(28, "Arroz Frito", "Arroz salteado con vegetales y huevo", ""),
            Dish(29, "Pollo Agridulce", "Pollo en salsa agridulce con piña", ""),
            Dish(30, "Chow Mein", "Fideos salteados con vegetales", "")
        )
    ),
    Restaurant(
        id = 11,
        name = "Sushi Zen",
        description = "Sushi fresco y elegante",
        imageUrl = "",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(31, "California Roll", "Roll con cangrejo, aguacate y pepino", ""),
            Dish(32, "Nigiri de Salmón", "Salmón sobre arroz", ""),
            Dish(33, "Tempura", "Verduras y camarones empanizados", "")
        )
    ),
    Restaurant(
        id = 12,
        name = "Sabores de Corea",
        description = "Platos tradicionales coreanos",
        imageUrl = "",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(34, "Bibimbap", "Arroz con vegetales, carne y huevo", ""),
            Dish(35, "Tteokbokki", "Pasteles de arroz en salsa picante", ""),
            Dish(36, "Kimchi", "Col fermentada picante", "")
        )
    ),
    Restaurant(
        id = 13,
        name = "Green Bowl",
        description = "Bowls saludables con ingredientes frescos",
        imageUrl = "",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(37, "Bowl de Quinoa", "Con quinoa, pollo, espinaca y hummus", ""),
            Dish(38, "Ensalada Mediterránea", "Con aceitunas, tomate, queso feta y garbanzos", ""),
            Dish(39, "Wrap Vegano", "Con vegetales asados y hummus en tortilla integral", "")
        )
    ),
    Restaurant(
        id = 14,
        name = "Vital Juice & Food",
        description = "Jugos y comidas que nutren el cuerpo",
        imageUrl = "",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(40, "Jugo Detox Verde", "Con espinaca, manzana, apio y jengibre", ""),
            Dish(41, "Tofu al Curry", "Tofu salteado con vegetales y arroz integral", ""),
            Dish(42, "Sopa de Lentejas", "Lentejas, zanahoria y cúrcuma", "")
        )
    ),
    Restaurant(
        id = 15,
        name = "Natural Bites",
        description = "Snacks naturales y orgánicos",
        imageUrl = "",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(43, "Barra de Avena", "Con avena, almendras y miel", ""),
            Dish(44, "Smoothie de Berries", "Batido con frutos rojos y leche vegetal", ""),
            Dish(45, "Ensalada Thai", "Con col morada, zanahoria, maní y aderezo de sésamo", "")
        )
    ),

    // 🅕 Postres y Dulces
    Restaurant(
        id = 16,
        name = "Dulce Tentación",
        description = "Deliciosos postres caseros",
        imageUrl = "",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(46, "Cheesecake de Fresa", "Tarta de queso con base de galleta y fresa natural", ""),
            Dish(47, "Brownie Clásico", "Bizcocho de chocolate intenso", ""),
            Dish(48, "Tres Leches", "Pastel empapado en tres tipos de leche", "")
        )
    ),
    Restaurant(
        id = 17,
        name = "ChocoLovers",
        description = "Especialistas en postres de chocolate",
        imageUrl = "",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(49, "Fondue de Chocolate", "Con frutas y malvaviscos", ""),
            Dish(50, "Mousse de Chocolate", "Espuma ligera de chocolate oscuro", ""),
            Dish(51, "Tarta de Nutella", "Tarta con base de galleta y crema de avellana", "")
        )
    ),
    Restaurant(
        id = 18,
        name = "Helados del Cielo",
        description = "Helados artesanales de todos los sabores",
        imageUrl = "",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(52, "Helado de Vainilla", "Clásico helado cremoso", ""),
            Dish(53, "Helado de Pistacho", "Con trozos de pistacho natural", ""),
            Dish(54, "Banana Split", "Plátano con helado, crema y cereza", "")
        )
    ),

    // 🅖 Bebidas
    Restaurant(
        id = 19,
        name = "Coffee & Co.",
        description = "Café gourmet y repostería",
        imageUrl = "",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(55, "Latte", "Café con leche vaporizada", ""),
            Dish(56, "Espresso", "Shot de café concentrado", ""),
            Dish(57, "Cappuccino", "Con espuma cremosa y cacao", "")
        )
    ),
    Restaurant(
        id = 20,
        name = "Bubble Wave",
        description = "Té de burbujas y bebidas asiáticas",
        imageUrl = "",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(58, "Bubble Tea de Taro", "Té con leche y perlas de tapioca", ""),
            Dish(59, "Té Verde Matcha", "Té con leche vegetal y tapioca", ""),
            Dish(60, "Milk Tea Clásico", "Té negro con leche y azúcar morena", "")
        )
    ),
    Restaurant(
        id = 21,
        name = "Refrescos Tropic",
        description = "Jugos y refrescos naturales",
        imageUrl = "",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(61, "Jugo de Mango", "100% natural", ""),
            Dish(62, "Agua de Coco", "Servida fría y fresca", ""),
            Dish(63, "Limonada con Hierbabuena", "Refrescante y aromática", "")
        )
    )
)
