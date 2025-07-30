DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'priority_data') THEN
        CREATE TYPE priority_data AS ENUM('高', '中', '低');
    END IF;
END $$;

CREATE TYPE status_data AS ENUM('未着手', '着手中', '完了');

CREATE TABLE IF NOT EXISTS todos (
    id SERIAL NOT NULL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    priority priority_data NOT NULL DEFAULT '中',
    status status_data NOT NULL DEFAULT '未着手'
);