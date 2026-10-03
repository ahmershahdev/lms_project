# Library Management System (LMS) — SEC321L Software Construction Lab

> **Note:** This is a temporary repository made for my SEC321L lab submissions (Fall 2026).
> I will remove it a few months from now, after the semester ends.

**Student:** Syed Ahmer Shah  |  **Roll No:** 24BSSW065  |  **Program:** BSSE  |  **Instructor:** Madina Ali

The Java project built over Labs 1–6 of SEC321L (Fall 2026).

| Package | Lab | Contents |
|---|---|---|
| `com.hitms.lab01` | 1 | `HelloWorld`, `Colors` (Jansi) |
| `com.hitms.lab02` | 2 | `AreaCalculator`, `PriceUtils` (naming conventions and Javadoc) |
| `com.hitms.lab03` | 3 | `ReportUtil`, `CatalogueDemo` (modular programming) |
| `com.hitms.lab04` | 4 | `DivisionDemo`, `IssueBookDemo`, `MaxFinder`, `AppLogger` |
| `com.hitms.lms.*` | 2–6 | LMS core: `model`, `service`, `util`, `exception`, `Main` |

## Build and run

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.hitms.lms.Main"
mvn checkstyle:check
```
