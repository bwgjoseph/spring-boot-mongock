# Mongock

This project is created to learn and explore `mongock`, and to assess if this is feasible to use as a) one time migration tool b) version control schema changes

## Note

This does not seem to track the checksum per `@ChangeUnit` which means that in the event that a previous `@ChangeUnit` was changed, it will not be detected. This is unlike to `Liquibase`