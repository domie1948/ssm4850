const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm25hxr/",
            name: "ssm25hxr",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm25hxr/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "留学生交流互动论坛网站"
        } 
    }
}
export default base
