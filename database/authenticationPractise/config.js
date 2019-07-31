module.exports = {
    ENV: process.env.NODE_ENV || 'development',
    PORT: process.env.PORT || 3000,
    url: process.env.BASE_URL || 'http://localhost:3000',
    MONGODB_URI: process.env.MONGODB_URI || 'mongodb+srv://viveksh:Vivek@1997@cluster0-adrac.mongodb.net/test?retryWrites=true&w=majority'
}