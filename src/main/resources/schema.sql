CREATE TABLE post
(
    id bigint auto_increment primary key,
    title varchar(256) not null,
    content varchar(1024) null,
    created timestamp
);

CREATE TABLE comment
(
    id bigint auto_increment primary key,
    post_id bigint not null,
    content varchar null,
    created timestamp
);

ALTER TABLE comment
    ADD CONSTRAINT comment_post_id
        FOREIGN KEY (post_id) REFERENCES post(id);
