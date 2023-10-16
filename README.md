## Calorie-Tracker Video
https://github.com/TahaYounis/Calorie-Tracker/assets/82248336/5e631750-e4ec-49c2-872b-c0ffae2717b0


## Onboarding module 
- The user enters his information such as gender, age, height, weight, and activity
- He sets his goals, such as the percentage of carbohydrates, proteins, and fats he needs daily, and his goal, whether to lose, maintain, or gain weight. 

## Tracker module 
- He can search for all types of food and drinks available on the server and insert them to breakfast, lunch, dinner, or snacks.
- He can track the percentage of carbohydrates, proteins, and fats daily via the nutritional bar
- He can track the percentage of carbohydrates, proteins, and fats daily via the nutritional bar

buildSrc module for build specific configuration.
core module contains all shared logic or classes that we need in all of other modules.

## Layered-Feature modularization
- Kind of combined hybrid model, that use Layers and Features Modularization Strategy 
- Modularization by feature with layer sub-modules, module for each feature like tracker feature and inside the module there is sub-modules for layers (presentation – domain – data)
- Combines advantages of layer and feature-based modularization, like easily reuse a single feature, easily delegate work, clear separation of concerns, and keep modules a little bit smaller

## Technologies and Libraries
- Clean Architecture
- Jetpack compose
- Retrofit
- Use cases
- MVVM
- Room
- Animation
- canva
