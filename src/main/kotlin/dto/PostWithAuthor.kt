package dto

data class PostWithAuthor(
    val author: Author,
    val postWithComments: PostWithComments,

)