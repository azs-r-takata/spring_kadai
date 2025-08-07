CREATE TABLE IF NOT EXISTS todos (
    id SERIAL NOT NULL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    priority priority_data NOT NULL DEFAULT '中',
    status status_data NOT NULL DEFAULT '未着手'
);