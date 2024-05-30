## ui.theme

## Fichier MyTypography<br>
Échelle typographique par défaut pour *Material Design 3*<br>

|M3 |Taille de police/Hauteur de ligne par défaut|
| --- | --- |
|displayLarge |Roboto 57/64|
|displayMedium |Roboto 45/52|
|displaySmall |Roboto 36/44|
|headlineLarge |Roboto 32/40|
|headlineMedium |Roboto 28/36|
|headlineSmall |Roboto 24/32|
|titleLarge |New- Roboto Medium 22/28|
|titleMedium |Roboto Medium 16/24|
|titleSmall |Roboto Medium 14/20|
|bodyLarge |Roboto 16/24|
|bodyMedium |Roboto 14/20|
|bodySmall |Roboto 12/16|
|labelLarge |Roboto Medium 14/20|
|labelMedium |Roboto Medium 12/16|
|labelSmall |New Roboto Medium, 11/16|

```
bodyLarge = TextStyle(
    fontWeight = FontWeight.Normal,
    fontFamily = FontFamily.SansSerif,
    fontStyle = FontStyle.Italic,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.15.sp,
    baselineShift = BaselineShift.Subscript
)
```
## Fichier Shape.kt
```
val replyShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(24.dp)
)
```

Après avoir défini votre Shapes, vous pouvez le transmettre au <i>MaterialTheme M3</i><br>
Pour thématiser le contenu de votre application, définissez le jeu de couleurs, la typographie et les formes spécifiques à votre application dans le fichier **Theme.kt**.

```
MaterialTheme(
    colorScheme = 
    typography = /* ...fichier MyTypographiy
    shapes = /* ... fichier Shape
) {
    // M3 app content
}
```
