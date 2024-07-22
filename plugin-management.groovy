import jenkins.model.Jenkins

def plugins = ['git', 'workflow-aggregator', 'blueocean']
def pm = Jenkins.instance.pluginManager
def uc = Jenkins.instance.updateCenter

plugins.each {
    if (!pm.getPlugin(it)) {
        uc.getPlugin(it).deploy()
    }
}
